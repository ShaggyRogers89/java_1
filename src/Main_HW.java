public class Main_HW {
    public static void main(String[] args) {
        byte a = 15;
        short b = 12345;
        int c = 123456789;
        long d = 1234567890L;
        float e = 15.1234567f;
        double f = 15.1234567890;
        char g = 'A';
        boolean h = true;
        System.out.println(makeResult(1.5f,2.5f,3.3f,4.5f));
        System.out.println(isBetween(10));
        isPositiveNumber(-1);
        System.out.println(isPositiveOrNegative(0));
        helloName("Дмитрий");
        whatYearIs(400);
    }
    public static float makeResult(float a, float b, float c, float d){
        return (b + (c / d)) * a;
    }
    public static boolean isBetween(int e){
        return e >= 10 && e <= 20;
    }
    public static void isPositiveNumber(int number){
        if (0<=number) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static boolean isPositiveOrNegative(int g){
        return 0 > g;
    }
    public static void helloName(String name){
        System.out.println("Привет, " + name);
    }
    public static void whatYearIs(int h){
        if (h%4==0 && h%100!=0 || h%400==0){
            System.out.println("Год високосный");
        } else{
            System.out.println(("Год невисокосный"));
        }
    }
}
