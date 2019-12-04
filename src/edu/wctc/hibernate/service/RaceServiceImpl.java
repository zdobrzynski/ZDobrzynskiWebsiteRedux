package edu.wctc.hibernate.service;

import edu.wctc.hibernate.Entity.Race;
import edu.wctc.hibernate.dao.RaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService{

    @Autowired
    private RaceDAO raceDAO;

    @Override
    @Transactional
    public List<Race> getRaces() {
        return raceDAO.getRaces();
    }

    @Override
    @Transactional
    public void saveRace(Race newRace) {

    }

    @Override
    @Transactional
    public RaceDAO getRace(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<RaceDAO> getRaceByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public void deleteRace(int id) {

    }
}
