package com.hhorton.services;

import com.hhorton.model.Team;

/**
 * Created by hunterwork on 3/10/17.
 */
public class TeamComparer {
    public TeamComparer(){}
    public void compareTeams(Team a, Team b){
        //normal ppg
        double appgpoints = (a.getPointsPerGame() + b.getOpponentPointsPerGame()) / 2;
        double bppgpoints = (b.getPointsPerGame() + a.getOpponentPointsPerGame()) / 2;

        double apoints = 0.0;
        double bpoints = 0.0;

        //Turnover points
        apoints += (((a.getForcedTurnoversPerGame() + b.getTurnoversPerGame() + b.getTurnoversPerGame())/3) * a.getAveragePoint());
        bpoints += (((b.getForcedTurnoversPerGame() + a.getTurnoversPerGame() + a.getTurnoversPerGame())/3) * b.getAveragePoint());

        //foul points
        apoints += (a.getFreeThrowPercentage() * (b.getFoulsPerGame() * 2));
        bpoints += (b.getFreeThrowPercentage() * (a.getFoulsPerGame() * 2));

        //offensive rebound points
        apoints += ((a.getOffensiveReboundsPerGame() - b.getDefensiveReboundPerGame()) * a.getAveragePoint());
        bpoints += ((b.getOffensiveReboundsPerGame() - a.getDefensiveReboundPerGame()) * b.getAveragePoint());

        //defensive rebound points
        apoints += ((a.getDefensiveReboundPerGame() - b.getOffensiveReboundsPerGame()) * a.getAveragePoint());
        bpoints += ((b.getDefensiveReboundPerGame() - a.getOffensiveReboundsPerGame()) * b.getAveragePoint());

        //two point FG points
        apoints += (((a.getTwoPointFGPercent() + a.getTwoPointFGPercent() + b.getOpponentFGPercent()) / 3) * (1 - a.getPercentThreePointFGTaken()))  * 2;
        bpoints += (((b.getTwoPointFGPercent() + b.getTwoPointFGPercent() + a.getOpponentFGPercent()) / 3) * (1 - b.getPercentThreePointFGTaken()))  * 2;

        //three point FG points
        apoints += (((a.getThreePointFGPercent() + a.getThreePointFGPercent() + b.getOpponentThreePointFGPercent()) / 3) * a.getPercentThreePointFGTaken()) * 3;
        bpoints += (((b.getThreePointFGPercent() + b.getThreePointFGPercent() + a.getOpponentThreePointFGPercent()) / 3) * b.getPercentThreePointFGTaken()) * 3;

        System.out.println(a.getName() + ": " + Math.round(appgpoints) + " | " + apoints);
        System.out.println(b.getName() + ": " + Math.round(bppgpoints) + " | " + bpoints);
        if(apoints > bpoints){
            System.out.println("\nWINNER: " + a.getName());
        }else{
            System.out.println("\nWINNER: " + b.getName());
        }
        System.out.println("\n----------------------------------\n");
    }
}
