package com.projectRestApiLearn.rest.webservices.restful_web_services.versioning;

public class Name {
    private String name;
    private String lastName;

    public Name(String name, String lastName) {
        super();
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
