package com.krisburns.roadai.model;

public enum RoadType {
    HIGHWAY(33.33, 4),
    ARTERIAL(22.22, 3),
    COLLECTOR(13.89, 2),
    LOCAL(8.33, 1);

    private final double defaultSpeed; // In milisec
    private final int defaultLanes;

    RoadType(double defaultSpeed, int defaultLanes) {
        this.defaultSpeed = defaultSpeed;
        this.defaultLanes = defaultLanes;
    }

    public double getDefaultSpeed() {
        return defaultSpeed;        
    }   

    public int getDefaultLanes() {
        return defaultLanes;
    }
}
