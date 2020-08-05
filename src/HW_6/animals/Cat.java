package HW_6.animals;

import HW_6.animals.Animal;

public class Cat extends Animal {
    static int countcat = 0;
    public Cat(String name, String color, int age) {
        super(name, color, age);
        countcat++;
    }

    @Override
    public void runAnimal(int runRange) {
        if (runRange > 200) {
            System.out.printf("%s не может пробежать больше %d метров\n", name, runRange);
        } else {
            System.out.printf("%s пробежал %d метров\n", name, runRange);
        }
    }

    @Override
    public void swimAnimal(int swimRange) {
        if (swimRange > 0) {
            System.out.printf("%s не умеет плавать\n", name);
        }
    }

    @Override
    public void foodAnimal(int foodRange) {
        if (foodRange > 2) {
            System.out.printf("Мама (отправляет милое фото) %s съел %d кило" +
                    " корма и спит\nМама (фото через 2 часа) %s Умер\n", name, foodRange, name);
        } else {
            System.out.printf("%s съел %d кило корма\n", name, foodRange);
        }
    }
    public static int getCountCat() {
        return countcat;
    }
}
