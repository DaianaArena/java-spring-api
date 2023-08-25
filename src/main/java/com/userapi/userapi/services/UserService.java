package com.userapi.userapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userapi.userapi.dao.UserDao;
import com.userapi.userapi.models.User;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
     
    //GET ALL USERS
    public List<User> getALL(){
        return userDao.getALL();
    }

     //GET USER BY ID
    public User get(long id){
        
         return userDao.get(id);
    }

    //POST USER
    public User register(User user){
        
         return userDao.register(user);
    }

    //UPDATE USER
    public User update(User user){
        
             return userDao.update(user);

    }

    //DELETE USER
    public void delete(long id){
        
        userDao.delete(id);
        
    }
}
