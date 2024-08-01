package com.projectRestApiLearn.rest.webservices.restful_web_services.jpa;

import com.projectRestApiLearn.rest.webservices.restful_web_services.Users.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
