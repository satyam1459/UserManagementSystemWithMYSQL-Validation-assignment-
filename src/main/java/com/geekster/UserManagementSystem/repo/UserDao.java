package com.geekster.UserManagementSystem.repo;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

}
