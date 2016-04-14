package com.hanparsy.erp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
        public void save(T entity);
        public void update(T entity);
        public void delete(Serializable id);
        public T findById(Serializable id);
        public List<T> findByHql(final String hql, final Object ... params);
        public List<T> findBySql(final String  sql, final Object... objects);
        public List<Object> findBySqlSp(String sql, Object[] objects, Class[] classes);
        public List<Map> getMapBySql(String sql, Object[] objects);
}
