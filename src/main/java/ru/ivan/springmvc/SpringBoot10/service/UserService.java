package ru.ivan.springmvc.SpringBoot10.service;


import jakarta.validation.Valid;
import ru.ivan.springmvc.SpringBoot10.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(@Valid User updateUser);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

}