package com.hanparsy.erp.service;

import java.io.Serializable;

import com.hanparsy.erp.entity.User;

public interface UserService {
        public static final String LOGIN_SUCCESS = "登录成功";
        public static final String WRONG_PASSWORD = "密码错误";
        public static final String USER_UNFOUND = "没有相应用户";
        public User doLogin(String corpname, String username, String psw, StringBuilder msg);

        public void update(User user);

        public void delete(Serializable id);

        public void addUser(User user);
        
}
