package HW_7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        System.out.println("Сейчас в миске " + plate.getFood() + " еды для котов");
        plate.increaseFood(250);
        System.out.println("Сейчас в миске " + plate.getFood() + " еды для котов");
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 100);
        cat[1] = new Cat("Vasek", 150);
        cat[2] = new Cat("Tusek", 200);
        System.out.println("В доме есть три кота: " + cat[0].getName() + " " +
                cat[1].getName() + " " + cat[2].getName());
        for (Cat i : cat) {
            if (plate.getFood() >= 0 && plate.getFood() >= i.getAppetite()) {
                i.eat(plate);
                System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " корма" +
                        " и его сытость имеет статус: " + i.satietyCat());
            } else {
                System.out.println("Кот " + i.getName() + " остался без корма и его сытость имеет статус: "
                        + i.satietyCat() + ". Вполне возможно что он скоро умрет\nДобавьте еды для него");
            }
        }
    }
}

