package org.example.webdevtask.service;

import org.example.webdevtask.entity.User;
import org.example.webdevtask.pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveData(UserPojo userPojo);
    List<User> getAll();

    void deleteById(Integer id);
    Optional<User> findById(Integer id);
}