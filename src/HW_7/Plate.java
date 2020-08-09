package HW_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void increaseFood(int addFood) {
        this.food += addFood;
        System.out.println("В тарелку добавили " + addFood + " граммов еды");
    }

    public int getFood() {
        return food;
    }
}
