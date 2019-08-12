package com.example.aayushscoutingapp;

public class Cycle {

    private int cycleID;
    public enum GameObject {HATCH, CARGO}
    public enum PickupSpot {GROUND, LOADER}
    public enum ScoreLocation {
        FRONT_CARGO, SIDE_CARGO, ROCKET_ONE, ROCKET_TWO, ROCKET_THREE
    }

    boolean gamePieceScored = false;
    private double time;

    private GameObject gameObject;
    private PickupSpot pickupSpot;
    private ScoreLocation scoreLocation;

    public Cycle (GameObject object, PickupSpot pickup) {
        this.gameObject = object;
        this.pickupSpot = pickup;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void scoreGamePiece() {
        gamePieceScored = true;
    }

    public void setScoreLocation(ScoreLocation location) {
        this.scoreLocation = location;
    }
}
