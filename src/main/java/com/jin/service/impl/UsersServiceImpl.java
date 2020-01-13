package com.jin.service.impl;

import com.jin.demo.Users;
import com.jin.mapper.UsersMapper;
import com.jin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }

    @Override
    public List<Users> findUsersAll() {
        return this.usersMapper.selectUsersAll();
    }

    @Override
    public Users findUserById(Integer id) {
        return this.usersMapper.selectUsersById(id);
    }

    @Override
    public void updateUser(Users users) {
        this.usersMapper.updateUser(users);
    }

    @Override
    public void deleteUser(Integer id) {
        this.usersMapper.deleteUser(id);
    }
}
