package edu.wctc.hibernate.service;

import edu.wctc.hibernate.Entity.Race;
import edu.wctc.hibernate.dao.RaceDAO;

import java.util.List;

public interface RaceService {

    List<Race> getRaces();

    void saveRace(Race newRace);

    RaceDAO getRace(int id);

    List<RaceDAO> getRaceByName(String name);

    void deleteRace(int id);
}
