package practice_4_array;

public class pratice_array {
    public static void main(String[] args) {
        generateArray(5, 10, 50);
        int[] arr = generateArray(5, 1, 10);
        int[] arr1 = {1, 4, 8, 11, 5, 7, 16};

        // isPrimeArray(arr);
        if (!isPrimeArray(arr1)) {
            System.out.println("ko fai mảng toàn số nguyên tố");
        } else {
            System.out.println("là mảng toàn số nguyên tố");
        }

        if (!isAscendingArray(arr1)) {
            System.out.println("ko fai mang tang dan");
        } else {
            System.out.println("la mang tang dan");
        }

        countNumber(arr1);
        countPrimeNumber(arr1);

    }

    public static boolean isPrimeNumber(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean isPrimeArray(int[] arr) {
        boolean prime = true;
        for (int i : arr) {
            if (!isPrimeNumber(arr[i])) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static boolean isAscendingArray(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    check = false;
                    break;
                }
            }
        }
        return check;

    }

    public static void countNumber(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 4 == 0 && j % 5 != 0) {
                count++;
            }

        }
        System.out.println("tổng số lượng số chia hết cho nhưng ko chia hết cho 5 là " + count);

    }

    public static void countPrimeNumber(int[] arr) {
        for (int j : arr) {
            if (isPrimeNumber(j)) {
                System.out.print(j + ",");
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
}
