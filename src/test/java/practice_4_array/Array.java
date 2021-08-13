package practice_4_array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.format("%d, ", arr[i]);
//        }
//        System.out.println();
//
//        for (int b : arr) {
//            System.out.format("%d, ", b);
//        }
//        System.out.println();
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.format("%d, ", i);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.format("a[%d] = ", i);
            arr1[i] = sc.nextInt();
        }
        printArray(arr1);

        System.out.println();
        System.out.println("sum= " + sumElement(arr1));
        sortArray(arr1);
        printArray(arr1);

        int[] arr = generateArray(5, 1, 10);
        printArray(arr);
    }

    public static void printArray(int []arr1) {
        for (int j : arr1) {
            System.out.format("%d, ", j);
        }
    }

    public static int sumElement(int[] arr1) {
        int req = 0;
        for (int ele : arr1) {
            req += ele;
        }
        return req;
    }

    public static void sortArray(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int tam = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tam;
                }
            }
        }
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] req = new int[n];
        for (int i = 0; i < req.length; i++) {
            req[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return req;
    }

    public static boolean isEven(int[] arr) {
        for (int n : arr) {
            if (n % 2 != 0) {
                return false;

            }
            break;
        }
        return true;
    }
}
