package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getListOfUser() {

        return userDao.findAll();
    }

    public User getUser(int userId) {
        return userDao.getOne(userId);
    }

    public String addUser(User user) {
       userDao.save(user);
       return "Added successfully";
    }

    public String updateUser(User user){
        userDao.save(user);
        return "Updated Successfully";
    }
     public String deleteUser(int userId){
        User entity = userDao.getOne(userId);
        userDao.delete(entity);
        return "Delete Success";
    }
}
