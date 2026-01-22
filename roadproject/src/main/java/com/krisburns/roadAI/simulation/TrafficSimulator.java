package com.krisburns.roadAI.simulation;

import com.krisburns.roadAI.network.RoadNetwork;

public class TrafficSimulator {

    private final RoadNetwork network;

    public TrafficSimulator(RoadNetwork network) {
        this.network = network;
    }

    public void step()  {
        // Vehicle Movement maybe?
    }

    public void run(int steps) {
        for (int i = 0; i < steps; i++) {
            step();
        }
    }
}