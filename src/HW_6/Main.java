package HW_6;

import HW_6.animals.Cat;
import HW_6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 3);
        Dog dog = new Dog("Tuzik", "black", 2);
        Dog dog2 = new Dog("Bobik", "white", 6);
        cat.runAnimal(200);
        dog.runAnimal(550);
        cat.swimAnimal(2);
        dog.swimAnimal(5);
        cat.foodAnimal(3);
        dog.foodAnimal(20);
        System.out.printf("Всего было создано котов: %d\n", cat.getCountCat());
        System.out.printf("Всего было создано собак: %d\n", dog.getCountDog());
    }
}
