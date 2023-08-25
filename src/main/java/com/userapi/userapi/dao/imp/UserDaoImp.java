package com.userapi.userapi.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.userapi.userapi.dao.UserDao;
import com.userapi.userapi.models.User;

@Transactional
@Repository
public class UserDaoImp implements UserDao {
    
    @PersistenceContext
    EntityManager entityManager;

     //GET ALL USERS
    @Transactional
     @Override
    public List<User> getALL(){
        String hql = "FROM User as u ";
        return (List <User>) entityManager.createQuery(hql).getResultList();
       
    };


     //GET USER BY ID
     @Transactional
     @Override
    public User get(long id){

        return entityManager.find(User.class, id);

    }

    //POST USER
    @Transactional
    @Override
    public User register(User user){
        entityManager.merge(user);

        return user;
    }

    //UPDATE USER
    @Transactional
    @Override
   public User update(User user){
        entityManager.merge(user);

        return user;
   }

    //DELETE USER
    @Transactional
    @Override
    public void delete(long id){
        User user = get(id);
        entityManager.remove(user);

    }
}
