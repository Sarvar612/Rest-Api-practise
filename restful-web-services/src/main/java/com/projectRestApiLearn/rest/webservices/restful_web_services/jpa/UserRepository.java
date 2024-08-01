package com.projectRestApiLearn.rest.webservices.restful_web_services.jpa;

import com.projectRestApiLearn.rest.webservices.restful_web_services.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
