package com.example.demo.service;
 
import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

import com.example.demo.model.User;
 
 
public interface UserService {
 
    List<User> findAllUsers();
 
    @Secured("ROLE_ADMIN")
    void updateUser(User user);
 
    @Secured({ "ROLE_DBA", "ROLE_ADMIN" })
    void deleteUser(int id);
     
/*    @PostAuthorize ("returnObject.type == authentication.name")
    User findById(int id);
 
    @PreAuthorize("hasRole('ADMIN')")
    void updateUser(User user);
     
    @PreAuthorize("hasRole('ADMIN') AND hasRole('DBA')")
    void deleteUser(int id);*/
}