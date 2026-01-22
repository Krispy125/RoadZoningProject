package com.krisburns.roadAI.model;

public class Road {
    private final String id;
    private final RoadType type;
    private final Intersection from;
    private final Intersection to;

    private final int lanes;
    private final double speedLimit;  // meters a second, will probably change to mph later
    private final double length; // meters

    private int vehicleCount;

    public Road(
        String id,
        RoadType type,
        Intersection from,
        Intersection to,
        double length
    ) {
        this.id = id;
        this.type = type;
        this.from = from;
        this.to = to;
        this.length = length;
        this.lanes = type.getDefaultLanes();
        this.speedLimit = type.getDefaultSpeed();

        from.addOutgoing(this);
        to.addIncoming(this);
    }

    public double capacity() {
        return lanes * 2000; // Vehicles an hour
    }

    public double congestionFactor() {
        return Math.max(1.0, vehicleCount / capacity());
    }

    public double travelTime() {
        return (length / speedLimit) * congestionFactor(); 
    }

    public void addVehicle() {
        vehicleCount++;
    }

    public void removeVehicle() {
        vehicleCount = Math.max(0, vehicleCount - 1);
    }

    public String getId() {
        return id;
    }

    public Intersection getTo() { // Keep getting an error on this what am I doing :'(
        return to;
    }

}
