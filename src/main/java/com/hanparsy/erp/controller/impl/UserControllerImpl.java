package com.hanparsy.erp.controller.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.hanparsy.erp.controller.UserController;
import com.hanparsy.erp.entity.User;
import com.hanparsy.erp.service.UserService;

@Controller
public class UserControllerImpl implements UserController{
        @Autowired
        private UserService userService;

        @Override
        @RequestMapping("/**/toLogin")
        public String toLogin() {
                // TODO Auto-generated method stub
                return "login";
        }

        @Override
        @RequestMapping("/doLogin")
        public String doLogin(HttpServletRequest request, HttpServletResponse response ) {
                // TODO Auto-generated method stub
                String corpcode = (String) request.getParameter("corpcode");
                String username = (String) request.getParameter("username");
                String pwd = (String) request.getParameter("password");
                StringBuilder msg=new StringBuilder();
                User user = userService.doLogin(corpcode, username, pwd, msg);
                System.out.println(msg.toString());
                if(user!=null&&msg.toString().equals(UserService.LOGIN_SUCCESS)){
                        request.getSession().setAttribute("user", user);
                        return "index";
                }else{
                        request.setAttribute("msg", msg.toString());
                        return "login";
                }
                
        }
                
}
