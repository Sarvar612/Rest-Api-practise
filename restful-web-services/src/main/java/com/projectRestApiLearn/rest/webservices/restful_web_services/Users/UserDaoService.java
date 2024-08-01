package com.projectRestApiLearn.rest.webservices.restful_web_services.Users;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static final List<User> users=new ArrayList<>();
    private static int count=0;
    static {
        users.add(new User(++count,"JAVA", LocalDate.now().minusYears(1)));
        users.add(new User(++count,"JAYSON", LocalDate.now().minusYears(2)));
        users.add(new User(++count,"PACK", LocalDate.now().minusYears(5)));
    }
    public List<User> findAll(){
        return users;
    }

    public User findById(int id){
//        for(User user:users){
//            if(id==user.getId()){
//                return user;
//            }
//        }
//      return null;
        Predicate<? super User> predicate=user -> user.getId()==id;
        return users.stream().filter(predicate).findFirst().get();

    }

    public void deleteById(int id){
//        for(User user:users){
//            if(id==user.getId()){
//                return users.remove(user.getId());
//            }
//        }
//      return null;
        Predicate<? super User> predicate=user -> user.getId()==id;
        users.removeIf(predicate);

    }
    public User save(User user){
        user.setId(++count);
        users.add(user);
        return user;
    }
}
