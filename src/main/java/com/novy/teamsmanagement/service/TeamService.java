package com.novy.teamsmanagement.service;

import com.novy.teamsmanagement.model.Team;

import java.util.Collection;

/**
 * Created by novy on 18.10.14.
 */
public interface TeamService {

    Collection<Team> findAll();
    Team findById(Integer id);
    void addTeam(Team team);
    void updateTeam(Team team);
    void deleteTeam(Integer id);

}
