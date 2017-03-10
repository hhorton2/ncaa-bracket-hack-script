package com.hhorton;

import com.hhorton.model.Team;
import com.hhorton.services.TeamComparer;
import com.hhorton.services.DataService;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, Team> teams = new DataService().getTeams();
        TeamComparer tc = new TeamComparer();
    }
}
