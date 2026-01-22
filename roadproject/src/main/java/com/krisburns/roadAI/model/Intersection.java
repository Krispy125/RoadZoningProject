package com.krisburns.roadAI.model;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    private final String id;
    private final List<Road> incoming = new ArrayList<>();
    private final List<Road> outgoing = new ArrayList<>();

    public Intersection(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Road> getIncoming() {
        return incoming;
    }

    public List<Road> getOutgoing() {
        return outgoing;
    }

    public void addIncoming(Road road) {
        incoming.add(road);
    }

    public void addOutgoing(Road road) {
        outgoing.add(road);
    }
}