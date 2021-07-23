package com.example.service;

import com.example.models.UserProfile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/rest")
public class HttpPostExample {
    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public UserProfile createUserProfile(UserProfile userProfile){
        String firstName = userProfile.getFirstName();
        String lastName = userProfile.getLastName();

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);

        return userProfile;
    }
    @Path("/say")
    @GET
    public String say(){
        return "Hello my friend!";
    }

}
