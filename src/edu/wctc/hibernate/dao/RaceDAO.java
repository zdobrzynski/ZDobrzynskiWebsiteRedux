package edu.wctc.hibernate.dao;

import edu.wctc.hibernate.Entity.Race;

import java.util.List;

public interface RaceDAO {

    List<Race> getRaces();

    void saveRace(Race newRace);

    RaceDAO getRace(int id);

    List<RaceDAO> getRaceByName(String name);

    void deleteRace(int id);

}
