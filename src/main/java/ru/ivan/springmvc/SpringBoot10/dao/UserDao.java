package ru.ivan.springmvc.SpringBoot10.dao;


import jakarta.validation.Valid;
import ru.ivan.springmvc.SpringBoot10.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(@Valid User updateUser);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

}