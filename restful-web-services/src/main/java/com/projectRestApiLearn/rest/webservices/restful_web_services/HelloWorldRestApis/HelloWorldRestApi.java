package com.projectRestApiLearn.rest.webservices.restful_web_services.HelloWorldRestApis;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@RestController
public class HelloWorldRestApi {
    public HelloWorldRestApi(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    private MessageSource messageSource;

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternalized(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
        
    }


    @GetMapping(path = "/hello-world")
    public HelloWorldBean hello(){
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world-another/{name}")
    public HelloWorldBean HelloWorldWithInput(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello: %s",name));
    }
}





class HelloWorldBean{
    private String message;

    public HelloWorldBean(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
