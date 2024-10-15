import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        double[] decimalNum = {1.57, 7.654, 9.986};
        for (int n = 0; n < arr.length; n++) {
            System.out.println(decimalNum[n]);
        }
        byte[] chars = {3, 7, 15, 2};
        for (int v = 0; v < chars.length; v++) {
            System.out.println(chars[v]);
        }
        // Task 2
        System.out.println("Задача 2");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int n = 0; n < arr.length; n++) {
            if (n == decimalNum.length-1) {
                System.out.println(decimalNum[n]);
                break;
            }
            System.out.print(decimalNum[n] + ", ");
        }
        System.out.println(Arrays.toString(chars));
        // Task 3
        System.out.println("Задача 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int n = arr.length - 1; n >= 0; n--) {
            if (n == 0) {
                System.out.println(decimalNum[n]);
                break;
            }
            System.out.print(decimalNum[n] + ", ");
        }
        for (int v = chars.length - 1; v >= 0; v--) {
            if (v == 0) {
                System.out.println(chars[v]);
                break;
            }
            System.out.print(chars[v] + ", ");
        }
        // Task 4
        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}



