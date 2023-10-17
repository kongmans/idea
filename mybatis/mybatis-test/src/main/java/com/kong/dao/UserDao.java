package com.kong.dao;

import com.kong.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    void addUser  (User user);
    int updateUser(User user );
    int  deleteUser(int id);

}
