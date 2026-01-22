package com.krisburns.roadAI.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.krisburns.roadAI.model.Intersection;
import com.krisburns.roadAI.model.Road;

public class RoadNetwork {

    private final Map<String, Intersection> intersections = new HashMap<>();
    private final List<Road> roads = new ArrayList<>();

    public Intersection addIntersection(String id) {
        Intersection i = new Intersection(id);
        intersections.put(id, i);
        return i;
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public Collection<Intersection> getIntersections() {
        return intersections.values();
    }

    public List<Road> getRoads() {
        return roads;
    }

}