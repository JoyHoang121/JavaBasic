package practice_4_array;

public class pratice_array {

    // 1 hàm
    public static void test(String[] args) {
        generateArray(5, 10, 50);
        int[] arr = generateArray(5, 1, 10);
        int[] arr1 = {1, 4, 8, 11, 5, 7, 16};
        System.out.println(arr1);

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
        long sumPrime = countPrimeNumber(arr1);
        System.out.println("Tổng số nguyên tố " + sumPrime);

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

    public static int countNumber(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 4 == 0 && j % 5 != 0) {
                count++;
            }

        }
        return count;


    }

    public static long countPrimeNumber(int[] arr) {
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            if (isPrimeNumber(arr[i])) {
                sum = sum + arr[i];

            }

        }
        return sum;

    }


    public static int[] generateArray(int n, int min, int max) {
        int[] req = new int[n];
        for (int i = 0; i < req.length; i++) {
            req[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return req;
    }
}
