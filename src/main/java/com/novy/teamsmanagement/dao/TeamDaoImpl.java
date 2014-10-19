package com.novy.teamsmanagement.dao;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.novy.teamsmanagement.model.Player;
import com.novy.teamsmanagement.model.Rating;
import com.novy.teamsmanagement.model.Team;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by novy on 18.10.14.
 */
@Repository
public class TeamDaoImpl implements TeamDao {

    private static HashMap<Integer, Team> teams;

    static {
        teams = Maps.newHashMap(
                initTeams()
        );

    }

    private static Map<Integer, Team> initTeams() {
        final Team realMadrid = new Team(1, "Real Madrid", "Primera Division",
                Rating.OUTSTANDING, Lists.<Player>newArrayList());

        final Team realMadridCastilla = new Team(2, "Real Madrid Castilla", "Segunda Division",
                Rating.WEAK, Lists.<Player>newArrayList());

        final Team manchesterUnited = new Team(3, "Manchester United", "Barclays Premier League",
                Rating.GOOD, Lists.<Player>newArrayList());
        return ImmutableMap.of(
                realMadrid.getId(), realMadrid,
                realMadridCastilla.getId(), realMadridCastilla,
                manchesterUnited.getId(), manchesterUnited
        );
    }

    @Override
    public Collection<Team> findAll() {
        return teams.values();
    }

    @Override
    public Team findById(Integer id) {
        return teams.get(id);
    }

    @Override
    public void addTeam(Team team) {
        team.setId(findId());
        pushTeam(team);
    }

    private Integer findId() {
        Integer nextId = 1;
        while (teams.containsKey(nextId)) {
            nextId++;
        }

        return nextId;
    }

    private void pushTeam(Team team) {
        teams.put(
                team.getId(), team
        );
    }

    @Override
    public void updateTeam(Team team) {
        pushTeam(team);
    }

    @Override
    public void deleteTeam(Integer id) {
        teams.remove(id);
    }
}
