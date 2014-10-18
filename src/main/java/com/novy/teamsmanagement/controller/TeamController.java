package com.novy.teamsmanagement.controller;

import com.novy.teamsmanagement.model.Team;
import com.novy.teamsmanagement.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by novy on 18.10.14.
 */

@Controller
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping(value = "/all.json", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Collection<Team> viewAllTeams() {
        return teamService.findAll();
    }

    @RequestMapping("/layout")
    public String getTeamsPartialPage() {
        return "teams/layout";
    }
}
