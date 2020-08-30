package net.crudapp.service;

import net.crudapp.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void deleteUser(int id);
    void editUser(User user);
    User getUserById(int id);
}
