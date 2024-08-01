package com.projectRestApiLearn.rest.webservices.restful_web_services.Users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


@Entity
public class Post {
    @Id
    @GeneratedValue
    private int id;


    @Size(min=10)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Post(int id, String description, User user) {
        super();
        this.id = id;
        this.description = description;
        this.user = user;
    }

    public Post(User user) {

        this.user = user;
    }

    public Post() {

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public User getUser() {
        return user;
    }
}
