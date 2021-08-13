package practice_4_array;

public class PracticeArray1 {
    public static void main(String[] args) {
        int[] arr = generateArray(5, -10, -40);
        printArray(arr);
        System.out.println();
        System.out.format("Max = %d, ", findMax(arr));
        System.out.format("Min = %d, ", findMin(arr));
        System.out.println();
        int maxIndex = findMaxIndex(arr);
        System.out.format("Max = %d, Index = %d ", arr[maxIndex], maxIndex);
        System.out.println();
        int firstNegative = findNegativeIndex(arr);
        if (firstNegative >= 0) {
            System.out.format("FirstNegative = %d, index = %d ", arr[firstNegative], firstNegative);
        } else {System.out.println("Mảng không có phần tử âm");}

        int lastPositiveIndex = findLastPositiveIndex(arr);
        if (lastPositiveIndex >= 0) {
            System.out.format("LastPositive = %d, index = %d", arr[lastPositiveIndex], lastPositiveIndex);
        } else {System.out.println("Mảng không có phần tử duong");}

        System.out.println();
        int minPositiveIndex = findMinPositiveIndex(arr);
        if (minPositiveIndex >= 0) {
            System.out.format("findMinPositiveIndex = %d, index = %d", arr[minPositiveIndex], minPositiveIndex);
        } else {System.out.println("Mảng không có phần tử duong");}


        System.out.println();
        int maxNegativeIndex = findMaxNegativeIndex(arr);
        if (maxNegativeIndex >= 0) {
            System.out.format("maxNegativeIndex = %d, index = %d", arr[maxNegativeIndex], maxNegativeIndex);
        } else {System.out.println("Mảng không có phần tử âm");}

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMaxIndex(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int findNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1; //không có phần tử âm trong mảng
    }

    public static int findLastPositiveIndex(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;// không có số dương trong mảng
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static int findMinPositiveIndex(int[] arr) {
        int LastPositiveIndex = findLastPositiveIndex(arr);
        if (LastPositiveIndex < 0) {
            return -1; // không có phần tử âm trong mảng
        }

        int minPositiveIndex = LastPositiveIndex;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < arr[minPositiveIndex]) {
                minPositiveIndex = i;
            }
        }
        return minPositiveIndex;
    }

    public static int findMaxNegativeIndex(int [] arr){
        int maxNegativeIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 &&(maxNegativeIndex==-1 || arr[i]>arr[maxNegativeIndex])){
                maxNegativeIndex=i;

            }
        }
        return maxNegativeIndex;
    }


    public static int[] generateArray(int n, int min, int max) {
        int[] req = new int[n];
        for (int i = 0; i < req.length; i++) {
            req[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return req;
    }

    public static void printArray(int[] arr1) {
        for (int j : arr1) {
            System.out.format("%d, ", j);
        }
    }

}
