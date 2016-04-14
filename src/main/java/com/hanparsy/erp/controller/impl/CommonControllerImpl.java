package com.hanparsy.erp.controller.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanparsy.erp.controller.CommonController;

@Controller
public class CommonControllerImpl implements CommonController{

        @Override
        @RequestMapping("/*/add")
        @ResponseBody
        public Object add(HttpServletRequest request, HttpServletResponse response) {
                // TODO Auto-generated method stub
                String[] strarr=request.getRequestURL().toString().split("/");
                return strarr[strarr.length-2];
        }

        @Override
        public Object remove(HttpServletRequest request, HttpServletResponse response) {
                // TODO Auto-generated method stub
                return null;
        }

        @Override
        public Object update(HttpServletRequest request, HttpServletResponse response) {
                // TODO Auto-generated method stub
                return null;
        }

        
        @RequestMapping("/*/query")
        @ResponseBody
        @Override
        public Object query(HttpServletRequest request, HttpServletResponse response) {
                // TODO Auto-generated method stub
                String[] strarr=request.getRequestURL().toString().split("/");
                return strarr[strarr.length-2];
        }

}
