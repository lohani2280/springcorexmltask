package com.stackroute.domain;

public class Movie {
    private Actor actor1;

    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }
    public Actor getActor1() {
        return actor1;
    }

    public Movie(Actor actor){
        this.actor1 = actor;
    }
    public Movie(){}

    public void printActor() {
        actor1.printActorInfo();
    }
}
