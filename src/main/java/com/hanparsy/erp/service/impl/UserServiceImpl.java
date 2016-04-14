package com.hanparsy.erp.service.impl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanparsy.erp.dao.CorpDao;
import com.hanparsy.erp.dao.UserDao;
import com.hanparsy.erp.entity.Corp;
import com.hanparsy.erp.entity.User;
import com.hanparsy.erp.service.UserService;
@Service
public class UserServiceImpl implements UserService{
        
        @Autowired
        public UserDao userDao;
        
        @Autowired
        public CorpDao corpDao;
        @Override
        public User doLogin(String corpCode, String username, String psw, StringBuilder msg) {
                // TODO Auto-generated method stub
                List<User> list = userDao.findByHql("from User where corpCode=? and name = ?", corpCode, username);
                User user=null;
                if(!list.isEmpty()){
                       user = list.get(0);
                }
                if (user==null){
                        msg.append(USER_UNFOUND);
                }else if(!psw.equals(user.getPassword())){
                        msg.append(WRONG_PASSWORD);
                }else{
                        msg.append(LOGIN_SUCCESS);
                }
                return user;
        }
        
        @Override
        public void update(User user){
                userDao.update(user);
        }
        
        @Override
        public void delete(Serializable id){
                userDao.delete(id);
        }
        
        @Override
        public void addUser(User user){
                userDao.save(user);
        }
        
        
}
