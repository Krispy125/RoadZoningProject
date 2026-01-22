package com.krisburns.roadAI.network;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.krisburns.roadAI.model.Intersection;
import com.krisburns.roadAI.model.Road;


public class RoutePlanner {
    
    public List<Road> shortestPath(
        Intersection start,
        Intersection goal
    ) {
        Map<Intersection, Double> dist = new HashMap<>();
        Map<Intersection, Road> prev = new HashMap<>();
        PriorityQueue<Intersection> pq = new PriorityQueue<>(Comparator.comparingDouble(dist::get));

        dist.put(start, 0.0);
        pq.add(start);

        while(!pq.isEmpty()) {
            Intersection current = pq.poll();

            if (current.equals(goal)) break;

            for (Road r : current.getOutgoing()) {
                Intersection next = r.getTo();
                double alt = dist.get(current) + r.travelTime();

                if (alt < dist.getOrDefault(next, Double.POSITIVE_INFINITY)) {
                    dist.put(next, alt);
                    prev.put(next, r);
                    pq.add(next);
                }

            }
        }

        List<Road> path = new ArrayList<>();
        Intersection step = goal;

        while (prev.containsKey(step)) {
            Road r = prev.get(step);
            path.add(0, r);
            step = r.getTo() == step ? r.getTo() : null;
        }
        return path;
    }
}
