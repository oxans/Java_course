package Lesson06.model;

public class Animal {

    protected String name;
    protected String color;




    public Animal(String name, String color){
        this.name = name;
        this.color = color;



    }
    public void speak(){
        System.out.println("My name " + name);
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }


    public String getInfoAnimal(){
        return "My name is " + name + ", color " + color;
    }

    public void run(int distance){
        System.out.println(" your distance is " + distance);
    }
    public void swim(int swin){
        System.out.println("You need swim " +swin);
    }

}

