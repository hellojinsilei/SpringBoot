package com.jin.service;

import com.jin.demo.Users;

import java.util.List;

public interface UsersService {
    void addUser(Users users);
    List<Users> findUsersAll();
    Users findUserById(Integer id);
    void updateUser(Users users);
    void deleteUser(Integer id);
}
