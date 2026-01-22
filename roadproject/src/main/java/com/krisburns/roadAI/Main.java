package com.krisburns.roadAI;

import com.krisburns.roadAI.model.Intersection;
import com.krisburns.roadAI.model.Road;
import com.krisburns.roadAI.model.RoadType;
import com.krisburns.roadAI.network.RoadNetwork;
import com.krisburns.roadAI.simulation.TrafficSimulator;


public class Main {
    public static void main(String[] args) {
        RoadNetwork network = new RoadNetwork();

        Intersection a = network.addIntersection("A");
        Intersection b = network.addIntersection("B");
        Intersection c = network.addIntersection("C");

        network.addRoad(new Road("R1", RoadType.ARTERIAL, a, b, 1000));
        network.addRoad(new Road("R2", RoadType.LOCAL, b, c, 500));

        TrafficSimulator sim = new TrafficSimulator(network);
        sim.run(100);

        System.out.println("Sim complete.");
    }
}