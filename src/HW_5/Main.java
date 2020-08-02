package HW_5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov Ivan Ivanovich", "manager", "iii@mail.com",
                "89505555555", 10000, 25);
        person1.info();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "manager", "iii@mail.com",
                "89505555555", 10000, 25);
        persArray[1] = new Person("Petrov Petr Petrovich", "main manager", "ppp@mail.com",
                "89506666666", 30000, 45);
        persArray[2] = new Person("Dyunin Dmitry Gennadievich", "intern", "ddg@mail.com",
                "89507777777", 1000, 30);
        persArray[3] = new Person("Vasilev Vasiliy Vasilyevich", "boss", "vvv@mail.com",
                "89508888888", 100000, 51);
        persArray[4] = new Person("Alexandrov Alexandr Alexandrovich", "seller", "aaa@mail.com",
                "89509999999", 1000, 30);
        for (Person person : persArray) {
            if (person.getAge() > 40) {
                person.info();
            }
        }
    }

}
