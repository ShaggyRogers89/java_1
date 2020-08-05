package HW_6.animals;

import HW_6.animals.Animal;

public class Dog extends Animal {
    static int countdog = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        countdog++;
    }

    @Override
    public void runAnimal(int runRange) {
        if (runRange > 500) {
            System.out.printf("%s не может пробежать больше %d метров\n", name, runRange);
        } else {
            System.out.printf("%s пробежал %d метров\n", name, runRange);
        }
    }

    @Override
    public void swimAnimal(int swimRange) {
        if (swimRange > 10) {
            System.out.printf("%s не проплывет больше %d метров\n", name, swimRange);
        } else {
            System.out.printf("%s проплыл %d метров\n", name, swimRange);
        }
    }

    public static int getCountDog() {
        return countdog;
    }
}
