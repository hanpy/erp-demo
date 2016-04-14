package com.hanparsy.erp.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hanparsy.erp.dao.CorpDao;
import com.hanparsy.erp.entity.Corp;

@Transactional
@Repository
public class CorpDaoImpl extends BaseDaoImpl<Corp> implements CorpDao{

}
