package com.hanparsy.erp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

import com.mysql.fabric.Response;

public class SessionFilter implements Filter {

        @Override
        public void destroy() {
                // TODO Auto-generated method stub

        }

        @Override
        public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
                        throws IOException, ServletException {
                // TODO Auto-generated method stub
                HttpServletRequest request = (HttpServletRequest) arg0;
                String url = request.getRequestURL().toString();
                String[] strarr = url.split("/");
                String action = strarr[strarr.length - 1];
                System.out.println(action);
                if (!action.equals("doLogin") && !action.equals("toLogin")
                                && request.getSession().getAttribute("user") == null) {
                        ((HttpServletResponse) arg1).sendRedirect("/erp/toLogin");
                } else {
                        arg2.doFilter(arg0, arg1);
                }
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
                // TODO Auto-generated method stub

        }

}
