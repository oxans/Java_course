package Lesson05.online;

import Lesson05.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 26.07.2021
 */

public class Game {

    public static void main(String[] args) {
        System.out.println("Program start!");

        System.out.println(Hero.countHands);
        Hero.voice();

        System.out.println(Hero.Sword.testFieldClass);

//        Hero hero1 = new Hero("Player1");
//        Hero hero2 = new Hero("Player2", 150,250,1500,4780);

//        hero1.name = "Player1";
//        hero1.x = 10;
//        hero1.y = 25;
//        hero1.healthPoint = 150;
//        hero1.countSteps = 478;

//        hero2.name = "Player2";
//        hero2.x = 150;
//        hero2.y = 250;
//        hero2.healthPoint = 1500;
//        hero2.countSteps = 4780;
//        System.out.println("hero1.sword.name >> " + hero1.sword.name);
//        System.out.println("hero2.sword.name >> " + hero2.sword.name);

//        System.out.println(hero1.getName() + " " + hero1.getHealthPoint() + " " + hero1.getCountSteps());
//        System.out.println(hero2.getName() + " " + hero2.getHealthPoint() + " " + hero2.getCountSteps());
//        hero2.setName("Qwerty");
//        System.out.println(hero2.getName() + " " + hero2.getHealthPoint() + " " + hero2.getCountSteps());

//        hero2.sword.leg.name = "Leg123";

//        hero1.speak();
//        hero2.speak();
//        hero1.moveUp();
//        hero1.healSelf(15);

        System.out.println("Program end!");
    }

}
