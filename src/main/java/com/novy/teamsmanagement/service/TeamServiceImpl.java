package com.novy.teamsmanagement.service;

import com.novy.teamsmanagement.dao.TeamDao;
import com.novy.teamsmanagement.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by novy on 18.10.14.
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Override
    public Collection<Team> findAll() {
        return teamDao.findAll();
    }

    @Override
    public Team findById(Integer id) {
        return teamDao.findById(id);
    }

    @Override
    public void addTeam(Team team) {
        teamDao.addTeam(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamDao.updateTeam(team);
    }

    @Override
    public void deleteTeam(Integer id) {
        teamDao.deleteTeam(id);
    }
}
