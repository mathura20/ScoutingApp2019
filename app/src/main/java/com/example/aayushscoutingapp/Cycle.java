package com.example.aayushscoutingapp;

import java.util.ArrayList;

public class Cycle extends Object {

    private int cycleId;
    private double time;
    private boolean gamepieceScored = false;

    private enum GamePiece {
        HATCH, CARGO
    }

    private enum PickupForm{
        GROUND, LOADER
    }

    private enum ScoreLocation{
        FRONT_CARGO, SIDE_CARGO, LOW_ROCKET, MID_ROCKET, HIGH_ROCKET
    }

    private GamePiece gamePiece;
    private PickupForm pickupForm;
    private ScoreLocation scoreLocation;

    ArrayList<Object> output = new ArrayList<Object>();


    public Cycle() {
        this.cycleId = cycleId;
    }

    public void setTime(double in) {
        this.time = in;
    }

    public void setScoreStatus(boolean in) {
        gamepieceScored = in;
    }

    public void setGamePiece(GamePiece s) {
        gamePiece = s;
    }

    public void setPickupForm(PickupForm s) {
        pickupForm = s;
    }

    public void setScoreLocation (ScoreLocation s) {
        scoreLocation = s;
    }

}