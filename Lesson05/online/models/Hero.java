package Lesson05.online.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 26.07.2021
 */

public class Hero {

    public static int countHands = 2;

    private String name; //class field
    private int speed;
    private int x;
    private int y;
    private int healthPoint;
    private int countSteps;
    private Sword sword;

    public Hero(String name) {
        this.name = name;
        this.sword = new Sword(12, 21, "12121212");
        speak();
    }

    public Hero(String name, int x, int y, int healthPoint, int countSteps) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.healthPoint = healthPoint;
        this.countSteps = countSteps;
        this.sword = new Sword(123, 58, "Sword Hero");
        System.out.println("I'm ready");
    }
//
//    public void run(int x, int y) {
//        this.speed = x + y * 2 / (x - y);
//        System.out.println("Hero run with speed " + speed);
//    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
    }

    public static void voice() {
        System.out.println("voice Hero!");
    }

    public void moveUp() {
        y -= 1;
        countSteps++;
        System.out.println("Hero move Up");
    }

    public void moveDown() {
        y += 1;
        countSteps++;
        System.out.println("Hero move Down");

    }

    public void moveLeft() {
        x -= 1;
        countSteps++;
        System.out.println("Hero move Left");

    }

    public void moveRight() {
        x += 1;
        countSteps++;
        System.out.println("Hero move Right");
    }

    public void healSelf(int value) {
        healthPoint += value;
        System.out.println("Hero heal self on " + value + " point");
    }

    public static class Sword {
        public int attackPoint;
        public int speedAttack;
        public String name;
        public Leg leg;
        public static int testFieldClass = 123;

        public Sword(int attackPoint, int speedAttack, String name) {
            this.name = name;
            this.attackPoint = attackPoint;
            this.speedAttack = speedAttack;
            this.leg = new Leg("Leg", 159, 951);
        }

        public class Leg {
            public String name;
            public int w;
            public int abc;

            public Leg(String name, int w, int abc) {
                this.name = name;
                this.w = w;
                this.abc = abc;
            }
        }
    }

    //Getter
    public String getName() {
//        return this.name;
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getCountSteps() {
        return countSteps;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


}
