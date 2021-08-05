package Lesson06;

import Lesson06.model.Animal;

public class Dog extends Animal {
    private int runMaxDistance;
    private int swimMaxDistance;

    public Dog(String name, String color){
        super(name, color);
        this.runMaxDistance = 500;
        this.swimMaxDistance = 10;
    }

    public void canRun(int distance){
        if (distance <= runMaxDistance){
            System.out.println(" I can run this distance");
        }else{
            System.out.println("Cat cans run only " + runMaxDistance + " from " + distance);
        }
    }

}
