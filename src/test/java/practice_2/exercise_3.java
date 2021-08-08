package practice_2;

import java.util.Scanner;

public class exercise_3 {
    static boolean year1 = false;
    static int year;

    public static void main(String[] args) {

        checkFormatDay();
    }

    public static boolean checkYear() {
        System.out.println("Mời nhập năm");
        Scanner n = new Scanner(System.in);
        year = n.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Đây là năm nhuận");
            year1 = true;

        } else {
            System.out.println("Đây không phải là năm nhuận");
        }
        return year1;

    }

    public static void checkFormatDay() {
        checkYear();
        System.out.println("Mời nhập tháng");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        if (m <= 0 || m > 12) {
            System.out.println("Tháng nhập không hợp lệ,");
        }
        System.out.println("Mời nhập ngày");
        int day = n.nextInt();
        if (day <= 0) {
            System.out.println("Ngày nhập không hợp lệ,");
        }
        {
            if (!year1) {
                if (m == 2) {
                    if (day > 28) {
                        System.out.println("Ngày nhập bị sai");
                    } else {
                        System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                    }
                }

            } else {
                if (m == 2) {
                    if (day > 29) {
                        System.out.println("Ngày nhập bị sai");
                    } else if (day < 29) {
                        System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                        System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
                        System.out.println("Sau ngày nhập 1 ngày " + (day + 1) + "/" + m + '/' + year);
                    } else {
                        System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                        System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
                    }
                }
            }
        }
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (day > 31) {
                System.out.println("Ngày nhập bị sai");
            } else if (day < 31) {
                System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
                System.out.println("Sau ngày nhập 1 ngày " + (day + 1) + "/" + m + '/' + year);
            } else {
                System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
            }
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (day > 30) {
                System.out.println("Ngày nhập bị sai");
            } else if (day < 30) {
                System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
                System.out.println("Sau ngày nhập 1 ngày " + (day + 1) + "/" + m + '/' + year);
            } else {
                System.out.println("Ngày tháng năm nhập đúng " + day + "/" + m + '/' + year);
                System.out.println("Trước ngày nhập 1 ngày " + (day - 1) + "/" + m + '/' + year);
            }
        }

    }


}


