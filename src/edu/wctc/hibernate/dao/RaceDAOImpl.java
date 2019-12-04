package edu.wctc.hibernate.dao;

import edu.wctc.hibernate.Entity.Race;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RaceDAOImpl implements RaceDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Race> getRaces() {
        Session session = sessionFactory.getCurrentSession();

        List<Race> raceList = session.createQuery("FROM Race", Race.class).getResultList();

        return raceList;
    }

    @Override
    public void saveRace(Race newRace) {

    }

    @Override
    public RaceDAO getRace(int id) {
        return null;
    }

    @Override
    public List<RaceDAO> getRaceByName(String name) {
        return null;
    }

    @Override
    public void deleteRace(int id) {

    }
}
