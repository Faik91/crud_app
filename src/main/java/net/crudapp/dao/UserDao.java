package net.crudapp.dao;

import net.crudapp.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void addUser(User user);
    void deleteUser(int id);
    void editUser(User user);
    User getUserById(int id);
}
