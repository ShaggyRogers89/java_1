package HW_5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String mobileNumber;
    private int salary;
    private int age;

    public Person(String fio, String position, String email,
                  String mobileNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("fio %s position %s email %s number %s salary %d, age %d\n"
                , fio, position, email, mobileNumber, salary, age);
    }

    int getAge() {
        return age;
    }
}
