package Lesson06;

import Lesson06.model.Animal;

public class Cat extends Animal {

    private int runMaxDistance;
    private int swimMaxDistance;

    public Cat(String name, String color){
        super(name, color);
        this.runMaxDistance = 200;
        this.swimMaxDistance = 0;
    }


    public int getRunMaxDistance(){
        return runMaxDistance;
    }
    public int getSwimMaxDistance(){
        return swimMaxDistance;
    }

    public void canRun(int distance){
        if (distance <= runMaxDistance){
            System.out.println(" I can run this distance");
        }else{
            System.out.println("Cat cans run only " + runMaxDistance + " from " + distance);
        }
    }


}
