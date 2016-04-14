package com.hanparsy.erp.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hanparsy.erp.dao.RoleDao;
import com.hanparsy.erp.entity.Role;

@Transactional
@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

}
