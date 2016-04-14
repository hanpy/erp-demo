package com.hanparsy.erp.dao.impl;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.hanparsy.erp.dao.UserDao;
import com.hanparsy.erp.entity.User;
import com.hanparsy.erp.service.*;

@Transactional
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
        
}
