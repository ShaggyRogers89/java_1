import java.util.Arrays;

public class Main_HW2 {
    public static void main(String[] args) {

//      Задание 1.

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        System.out.println(Arrays.toString(arr));

//      Задание 2.

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

//      Задание 3.

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

//      Задание 4.

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j || i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                }
                System.out.printf("%5d", arr4[i][j]);
            }
            System.out.println();
        }

//      Задание 5.

        int[] arr5 = {4, 15, 28, 3, 27, 12, 35, 8};
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (max < arr5[i]) {
                max = arr5[i];
            }
        }
        for (int i = 0; i < arr5.length; i++) {
            if (min > arr5[i]) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальное число массива = " + max);
        System.out.println("Минимальное число массива = " + min);

    }

    //      Задание 6.
    int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};


    public static boolean checkBalance(int[] arr6) {
        int summLeft = 0;
        int summRight = 0;
        int summAll = Arrays.stream(arr6).sum();
        System.out.println("Сумма чиссел всего массива = " + summAll);
        for (int i = 0; i < arr6.length; i++) {
            summLeft += arr6[i];
            summRight = summAll - arr6[i];
            if (summLeft == summRight) {
                return true;
            }
        }
        return false;
    }

}

