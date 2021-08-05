package Lesson06;
import Lesson06.model.Animal;

public class ActionDogCat {
    int CounterAnimals = 0;

    public static void main(String[] args){

        Cat cat1 = new Cat("Toby","grey");
        Dog dog1 = new Dog("Archi","black");

        System.out.println(cat1.getInfoAnimal());
        System.out.println(dog1.getInfoAnimal());

        int distance = 500;
        int swimDist = 10;

        Animal[] runDistance = {cat1, dog1};
        for (int i =0; i < runDistance.length; i++) {
            runDistance[i].run(distance);

            if (runDistance[i] instanceof Cat) {
                ((Cat) runDistance[i]).canRun(distance);
            } else {
                if (runDistance[i] instanceof Dog) {
                    ((Dog) runDistance[i]).canRun(distance);
                }
            }
        }

        for (int i =0; i < runDistance.length; i++) {
            runDistance[i].run(swimDist);

            if (runDistance[i] instanceof Cat) {
                ((Cat) runDistance[i]).canSwim(swimDist);
            } else {
                if (runDistance[i] instanceof Dog) {
                    ((Dog) runDistance[i]).canSwim(swimDist);
                }
            }
        }




    }


}
