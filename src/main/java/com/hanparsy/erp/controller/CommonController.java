package com.hanparsy.erp.controller;

import javax.servlet.http.*;

public interface CommonController {
        public Object add(HttpServletRequest request , HttpServletResponse response);
        
        public Object remove(HttpServletRequest request , HttpServletResponse response);
        
        public Object update(HttpServletRequest request , HttpServletResponse response);
        
        public Object query(HttpServletRequest request , HttpServletResponse response);
}
