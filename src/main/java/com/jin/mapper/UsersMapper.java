package com.jin.mapper;

import com.jin.demo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Mapper
@Service
public interface UsersMapper {
     void insertUser(Users users);
     List<Users>  selectUsersAll();
     Users selectUsersById(Integer id);

     void updateUser(Users users);
     void deleteUser(Integer id);
}
