package HW_7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety = 0;


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        satiety += appetite;
        satietyCat();
    }

    public boolean satietyCat() {
        if (appetite == satiety) {
            return true;
        } else {
            return false;
        }
    }
}
