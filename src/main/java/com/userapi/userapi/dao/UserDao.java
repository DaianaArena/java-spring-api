package com.userapi.userapi.dao;

import java.util.List;


import com.userapi.userapi.models.User;

public interface UserDao {
    
    //GET ALL USERS
    List<User> getALL();

     //GET USER BY ID
    User get(long id);

    //POST USER
    User register(User user);

    //UPDATE USER
   User update(User user);

    //DELETE USER
    void delete(long id);

}
