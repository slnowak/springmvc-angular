package com.novy.teamsmanagement.dao;

import com.novy.teamsmanagement.model.Team;

import java.util.Collection;

/**
 * Created by novy on 18.10.14.
 */
public interface TeamDao {

    Collection<Team> findAll();
    Team findById(Integer id);
    void addTeam(Team team);
    void updateTeam(Team team);
    void deleteTeam(Integer id);

}
