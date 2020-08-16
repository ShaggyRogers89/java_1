package HW_6.animals;

public class Animal {
    String name;
    String color;
    int age;
    int runRange;
    int swimRange;
    int foodRange;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void runAnimal(int runRange) {
        System.out.printf("%s пробежал %d метров\n", name, runRange);
    }

    public void swimAnimal(int swimRange) {
        System.out.printf("%s проплыл %d метров\n", name, swimRange);
    }

    public void foodAnimal(int foodRange) {
        System.out.printf("%s съел %d кило корма\n", name, foodRange);
    }

}
