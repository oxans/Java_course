package Lesson07.online.test;

import Lesson07.online.test.parts.*;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class Robot {

    private Random random = new Random();

    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;
    private Torso torso;
    private String name;

    private int level;

    private RobotPart[] target;

    public Robot(String name) {
        this.name = name;
        this.level = 1;
        this.head = new Head(this, "HeadRobot1");
        this.leftLeg = new Leg(this,"Left hand", level);
        this.rightLeg = new Leg(this,"Right hand", level);
        this.leftHand = new Hand(this,"Left Hand", level);
        this.rightHand = new Hand(this,"Right Hand", level);
        this.torso = new Torso(this,"Torso", level);
        this.target = new RobotPart[]{head, leftHand, rightHand, leftLeg, rightLeg, torso};
    }

    public void attackLeft(Robot robot) {
        leftHand.giveDamage(robot.target[random.nextInt(target.length)]);
    }

    public void attackRight(Robot robot) {
        rightHand.giveDamage(robot.target[random.nextInt(target.length)]);
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " says: " + head.randomString());
    }
}
