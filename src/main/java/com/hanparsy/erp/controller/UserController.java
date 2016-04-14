package com.hanparsy.erp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserController {
        public String toLogin();
        public String doLogin(HttpServletRequest request, HttpServletResponse response);
}
