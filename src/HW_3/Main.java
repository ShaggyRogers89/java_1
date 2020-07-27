package HW_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        gameRandomNumber();
        gameWords();
    }

    /*1. Написать программу, которая загадывает случайное число от 0 до 9,
     и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
      больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
       выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    public static void repeatGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int a = sc.nextInt();
        if (a == 1) {
            gameRandomNumber();
        } else {
            System.out.println("Спасибо за игру!");
        }
    }

    public static void gameRandomNumber() {
        System.out.println("Компьютер загадал рандомное число в диапазоне от 0 до 10. Попробуем разгадать его.\nУ вас есть 3 попытки");
        int count = 0;
        int randomNumb = (int) ((Math.random() * 10) + 1);
        int userNumb = -1;
        while (count < 3 && userNumb != randomNumb) {
            System.out.println("Введите предполагаемое число");
            userNumb = sc.nextInt();
            if (userNumb < randomNumb) {
                count++;
                System.out.println("Вы загадали слишком маленькое число. Попробуйте ещё раз");
                System.out.println("У вас осталось: " + (3 - count) + " попыток");
            } else if (userNumb > randomNumb) {
                count++;
                System.out.println("Вы загадали слишком большое число. Попробуйте ещё раз");
                System.out.println("У вас осталось: " + (3 - count) + " попыток");
            } else if (userNumb == randomNumb) {
                System.out.println("Поздравляю! Вы угадали!");
                System.out.println("Это заняло у вас: " + count + " попыток");
                repeatGame();
            }
        }
        System.out.println("Вы проиграли. Загаданное число:" + randomNumb);
        repeatGame();
    }

    /*
    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
    "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
     "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
     При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие б
    уквы
     */
    public static void gameWords() {
        System.out.println("Компьютер загадал рандомное слово из следующего массива слов:");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        String randomWord = words[rand.nextInt(words.length)];
        char[] str = new char[15];
        Arrays.fill(str, '#');
        char[] randomWordToChar = randomWord.toCharArray();
        while (true) {
            System.out.println("Ваша задача отгадать это слово.\nВведите свой вариант:");
            String userWord = sc.nextLine();
            char[] userWordToChar = userWord.toCharArray();
            if (!userWord.equals(randomWord)) {
                for (int i = 0; i < randomWordToChar.length; i++) {
                    if (randomWordToChar[i] == userWordToChar[i]) {
                        str[i] = randomWordToChar[i];
                    }
                }
                System.out.println(Arrays.toString(str));
            } else {
                System.out.println("Загаданное слово было: " + randomWord);
                break;
            }
        }
    }
}

