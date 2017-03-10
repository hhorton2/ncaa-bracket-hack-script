package com.hhorton.services;

import com.hhorton.model.Team;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by hunterwork on 3/10/17.
 */
public class DataService {
    public DataService() {
    }

    public HashMap<String, Team> getTeams() throws IOException {
        HashMap<String, Team> teams = new HashMap<>();
        FileReader in = new FileReader("DEFENSIVE_FIELD_GOAL.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            teams.putIfAbsent(record.get("Team"), new Team());
            teams.get(record.get("Team")).setOpponentFGPercent(Double.parseDouble(record.get("OPP FG%"))/100);
            teams.get(record.get("Team")).setName(record.get("Team"));
        }
        in.close();

        in = new FileReader("DEFENSIVE_REBOUNDS_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setDefensiveReboundPerGame(Double.parseDouble(record.get("RPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("DEFENSIVE_THREE_POINT_FIELD_GOAL_PERCENTAGE.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setOpponentThreePointFGPercent(Double.parseDouble(record.get("Pct"))/100);
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("FOULS_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setFoulsPerGame(Double.parseDouble(record.get("PFPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("FREE_THROW_PERCENTAGE.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setFreeThrowPercentage(Double.parseDouble(record.get("FT%"))/100);
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("OFFENSIVE_FIELD_GOAL.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setFGPercent(Double.parseDouble(record.get("FG%"))/100);
                teams.get(record.get("Team")).setFGAttempted(Double.parseDouble(record.get("FGA")));
                teams.get(record.get("Team")).setFGMade(Double.parseDouble(record.get("FGM")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("OFFENSIVE_REBOUNDS_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setOffensiveReboundsPerGame(Double.parseDouble(record.get("RPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("OFFENSIVE_THREE_POINT_FIELD_GOAL_PERCENTAGE.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setThreePointFGPercent(Double.parseDouble(record.get("3FG%"))/100);
                teams.get(record.get("Team")).setThreePointFGAttempted(Double.parseDouble(record.get("3FGA")));
                teams.get(record.get("Team")).setThreePointFGMade(Double.parseDouble(record.get("3FG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("REBOUND_MARGIN_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setReboundMarginPerGame(Double.parseDouble(record.get("REB MAR")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("SCORING_DEFENSE.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setOpponentPointsPerGame(Double.parseDouble(record.get("OPP PPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("SCORING_MARGIN_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setScoringMarginPerGame(Double.parseDouble(record.get("SCR MAR")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("SCORING_OFFENSE.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setPointsPerGame(Double.parseDouble(record.get("PPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("TOTAL_REBOUNDS_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setTotalReboundsPerGame(Double.parseDouble(record.get("RPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("TURNOVERS_FORCED_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setForcedTurnoversPerGame(Double.parseDouble(record.get("Avg")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();

        in = new FileReader("TURNOVERS_PER_GAME.csv");
        records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            if (teams.containsKey(record.get("Team"))) {
                teams.get(record.get("Team")).setTurnoversPerGame(Double.parseDouble(record.get("TOPG")));
            } else {
                //System.out.println(record.get("Team"));
            }
        }
        in.close();


        teams.forEach((key, value) -> {
            value.setPercentThreePointFGTaken(value.getThreePointFGAttempted() / value.getFGAttempted());
            value.setTwoPointFGPercent(((value.getFGMade()-value.getThreePointFGMade()) / (value.getFGAttempted() - value.getThreePointFGAttempted())));
            double averageThreePoint = value.getThreePointFGPercent() * 3;
            double averageTwoPoint = value.getTwoPointFGPercent() * 2;
            double averagePoint = (averageThreePoint * value.getPercentThreePointFGTaken()) + (averageTwoPoint * (1-value.getPercentThreePointFGTaken()));
            value.setAveragePoint(averagePoint);
        });
        return teams;
    }

}
