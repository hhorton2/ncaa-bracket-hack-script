package com.hhorton.model;

/**
 * Created by hunterwork on 3/10/17.
 */
public class Team {
    private String name;
    private double freeThrowPercentage;
    private double opponentFGPercent;
    private double defensiveReboundPerGame;
    private double opponentThreePointFGPercent;
    private double foulsPerGame;
    private double FGPercent;
    private double FGAttempted;
    private double FGMade;
    private double offensiveReboundsPerGame;
    private double threePointFGAttempted;
    private double threePointFGPercent;
    private double threePointFGMade;
    private double reboundMarginPerGame;
    private double opponentPointsPerGame;
    private double pointsPerGame;
    private double totalReboundsPerGame;
    private double forcedTurnoversPerGame;
    private double turnoversPerGame;
    private double averagePoint;
    private double percentThreePointFGTaken;
    private double scoringMarginPerGame;
    private double twoPointFGPercent;


    public Team(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public double getOpponentFGPercent() {
        return opponentFGPercent;
    }

    public void setOpponentFGPercent(double opponentFGPercent) {
        this.opponentFGPercent = opponentFGPercent;
    }

    public double getDefensiveReboundPerGame() {
        return defensiveReboundPerGame;
    }

    public void setDefensiveReboundPerGame(double defensiveReboundPerGame) {
        this.defensiveReboundPerGame = defensiveReboundPerGame;
    }

    public double getOpponentThreePointFGPercent() {
        return opponentThreePointFGPercent;
    }

    public void setOpponentThreePointFGPercent(double opponentThreePointFGPercent) {
        this.opponentThreePointFGPercent = opponentThreePointFGPercent;
    }

    public double getFoulsPerGame() {
        return foulsPerGame;
    }

    public void setFoulsPerGame(double foulsPerGame) {
        this.foulsPerGame = foulsPerGame;
    }

    public double getFGPercent() {
        return FGPercent;
    }

    public void setFGPercent(double FGPercent) {
        this.FGPercent = FGPercent;
    }

    public double getFGAttempted() {
        return FGAttempted;
    }

    public void setFGAttempted(double FGAttempted) {
        this.FGAttempted = FGAttempted;
    }

    public double getFGMade() {
        return FGMade;
    }

    public void setFGMade(double FGMade) {
        this.FGMade = FGMade;
    }

    public double getOffensiveReboundsPerGame() {
        return offensiveReboundsPerGame;
    }

    public void setOffensiveReboundsPerGame(double offensiveReboundsPerGame) {
        this.offensiveReboundsPerGame = offensiveReboundsPerGame;
    }

    public double getThreePointFGAttempted() {
        return threePointFGAttempted;
    }

    public void setThreePointFGAttempted(double threePointFGAttempted) {
        this.threePointFGAttempted = threePointFGAttempted;
    }

    public double getThreePointFGPercent() {
        return threePointFGPercent;
    }

    public void setThreePointFGPercent(double threePointFGPercent) {
        this.threePointFGPercent = threePointFGPercent;
    }

    public double getThreePointFGMade() {
        return threePointFGMade;
    }

    public void setThreePointFGMade(double threePointFGMade) {
        this.threePointFGMade = threePointFGMade;
    }

    public double getReboundMarginPerGame() {
        return reboundMarginPerGame;
    }

    public void setReboundMarginPerGame(double reboundMarginPerGame) {
        this.reboundMarginPerGame = reboundMarginPerGame;
    }

    public double getOpponentPointsPerGame() {
        return opponentPointsPerGame;
    }

    public void setOpponentPointsPerGame(double opponentPointsPerGame) {
        this.opponentPointsPerGame = opponentPointsPerGame;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public double getTotalReboundsPerGame() {
        return totalReboundsPerGame;
    }

    public void setTotalReboundsPerGame(double totalReboundsPerGame) {
        this.totalReboundsPerGame = totalReboundsPerGame;
    }

    public double getForcedTurnoversPerGame() {
        return forcedTurnoversPerGame;
    }

    public void setForcedTurnoversPerGame(double forcedTurnoversPerGame) {
        this.forcedTurnoversPerGame = forcedTurnoversPerGame;
    }

    public double getTurnoversPerGame() {
        return turnoversPerGame;
    }

    public void setTurnoversPerGame(double turnoversPerGame) {
        this.turnoversPerGame = turnoversPerGame;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    public double getPercentThreePointFGTaken() {
        return percentThreePointFGTaken;
    }

    public void setPercentThreePointFGTaken(double percentThreePointFGTaken) {
        this.percentThreePointFGTaken = percentThreePointFGTaken;
    }

    public double getScoringMarginPerGame() {
        return scoringMarginPerGame;
    }

    public void setScoringMarginPerGame(double scoringMarginPerGame) {
        this.scoringMarginPerGame = scoringMarginPerGame;
    }

    public double getTwoPointFGPercent() {
        return twoPointFGPercent;
    }

    public void setTwoPointFGPercent(double twoPointFGPercent) {
        this.twoPointFGPercent = twoPointFGPercent;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", freeThrowPercentage=" + freeThrowPercentage +
                ", opponentFGPercent=" + opponentFGPercent +
                ", defensiveReboundPerGame=" + defensiveReboundPerGame +
                ", opponentThreePointFGPercent=" + opponentThreePointFGPercent +
                ", foulsPerGame=" + foulsPerGame +
                ", FGPercent=" + FGPercent +
                ", FGAttempted=" + FGAttempted +
                ", offensiveReboundsPerGame=" + offensiveReboundsPerGame +
                ", threePointFGAttempted=" + threePointFGAttempted +
                ", threePointFGPercent=" + threePointFGPercent +
                ", reboundMarginPerGame=" + reboundMarginPerGame +
                ", opponentPointsPerGame=" + opponentPointsPerGame +
                ", pointsPerGame=" + pointsPerGame +
                ", totalReboundsPerGame=" + totalReboundsPerGame +
                ", forcedTurnoversPerGame=" + forcedTurnoversPerGame +
                ", turnoversPerGame=" + turnoversPerGame +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
