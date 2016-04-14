package com.hanparsy.erp.dao.impl;

import java.io.Serializable;
import java.lang.reflect.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.hanparsy.erp.dao.BaseDao;

import javassist.convert.Transformer;
@Transactional
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
        private Class<T> clazz;
        private Object[] objects;

        public BaseDaoImpl() {
                Type type = this.getClass().getGenericSuperclass();
                Type[] params = ((ParameterizedType) type).getActualTypeArguments();
                clazz = (Class) params[0];
        }
        @Resource(name="sessionFactory")
        public final void mySetSessionFactory(SessionFactory sessionFactory){
                super.setSessionFactory(sessionFactory);
        }
        @Override
        public void save(Object entity) {
                // TODO Auto-generated method stub
                getHibernateTemplate().save(entity);
        }

        @Override
        public void update(Object entity) {
                // TODO Auto-generated method stub
                getHibernateTemplate().update(entity);
        }

        @Override
        public void delete(Serializable id) {
                // TODO Auto-generated method stub
                getHibernateTemplate().delete(this.findById(id));
        }

        @Override
        @Transactional
        public T findById(Serializable id) {
                // TODO Auto-generated method stub
                return getHibernateTemplate().get(clazz, id);
//                T rs = (T) sessionFactory.getCurrentSession().get(clazz, id);
//                return rs;
        }

        @Override
        public List<T> findByHql(final String hql, final Object... params) {
                // TODO Auto-generated method stub
                return getHibernateTemplate().execute(new HibernateCallback<List<T>> (){

                        @SuppressWarnings("unchecked")
                        @Override
                        public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
                                // TODO Auto-generated method stub
                                Query q = session.createQuery(hql);
                                if(params != null){
                                        int p =0;
                                        for(Object param: params){
                                                q.setParameter(p++, param);
                                        }
                                }
                                return q.list();
                        }
                        
                });
        }
        
        @Override
        public List<T> findBySql(final String sql, final Object...objects ){
                return getHibernateTemplate().execute(new HibernateCallback<List<T>>(){

                        @SuppressWarnings("unchecked")
                        @Override
                        public List<T> doInHibernate(Session session) throws HibernateException, SQLException {
                                // TODO Auto-generated method stub
                                SQLQuery q = session.createSQLQuery(sql);
                                if( objects != null){
                                        int p = 0;
                                        for(Object obj:objects){
                                                q.setParameter(p++, obj);
                                        }
                                }
                                return q.addEntity(clazz).list();
                        }
                        
                });
        }
        
        @Override
        public List<Object> findBySqlSp(final String sql, final Object[] objects , final Class[] classes ){
                return getHibernateTemplate().execute(new HibernateCallback<List<Object>>(){

                        @Override
                        public List<Object> doInHibernate(Session session) throws HibernateException, SQLException {
                                // TODO Auto-generated method stub
                                SQLQuery q = session.createSQLQuery(sql);
                                if (classes!=null){
                                        for(Class cl: classes){
                                                q.addEntity(cl.getName(),cl);
                                        }
                                }
                                if(objects!=null){
                                        int p =0;
                                        for(Object obj:objects){
                                                q.setParameter(p++, obj);
                                        }
                                }
                                return q.list();
                        }
                        
                });
        }
        
        @Override
        public List<Map> getMapBySql(final String sql, final Object... objects ){
                return getHibernateTemplate().execute(new HibernateCallback<List<Map>>(){

                        @Override
                        public List<Map> doInHibernate(Session session) throws HibernateException, SQLException {
                                // TODO Auto-generated method stub
                                SQLQuery q = (SQLQuery) session.createSQLQuery(sql);
                                q.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
                                if(objects!=null){
                                        int position=0;
                                        for(Object obj:objects){
                                                q.setParameter(position++, obj);
                                        }
                                }
                                return q.list();
                        }
                        
                });
        }

}
