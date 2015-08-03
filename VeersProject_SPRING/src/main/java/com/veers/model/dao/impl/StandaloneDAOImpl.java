package com.veers.model.dao.impl;

import com.veers.model.beans.StandaloneVO;
import com.veers.model.dao.StandaloneDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StandaloneDAOImpl implements StandaloneDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<StandaloneVO> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return (List<StandaloneVO>) session.createQuery("from StandaloneVO").list();
    }

    @Override
    public void save(StandaloneVO standaloneVO) {
        Session session = sessionFactory.getCurrentSession();
        session.save(standaloneVO);
    }
}
