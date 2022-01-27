package com.web.service;

import com.web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void editUser(User user);
    void removeUser(long id);
    User getUser(long id);
    List<User> getAllUsers();
}
