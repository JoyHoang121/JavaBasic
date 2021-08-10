package practice_1_variant;

import java.util.Calendar;


public class Variant {


    public static void main(String[] args) {
        //Age();
        //CalculateNumber();
        //calculateVAT();
        // scoreStudent();
        // calculateCircle();
        LicensePlate();
        // minMax();
    }

    public static void Age() {
        int year = 1989;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        System.out.println("Your age is " + age);
    }

    public static void CalculateNumber() {
        int a = 9;
        int b = 10;
        double a1 = (double) a;
        double b1 = (double) b;
        System.out.println("Tổng 2 số a + b là " + (a + b));
        System.out.println("Tổng 2 số a - b là " + (a - b));
        System.out.println("Tổng 2 số a * b là " + (a * b));
        System.out.println("Tổng 2 số a / b là " + (a1 / b1));
    }

    public static void calculateVAT() {
        int quantity = 8;
        int unitPrice = 150000;
        System.out.println("Amount is " + (quantity * unitPrice));
        System.out.println("VAT is " + (quantity * unitPrice) * 0.1);
    }

    public static void scoreStudent() {
        double maths = 8.5;
        double phys = 6;
        double chemistry = 4.5;
        double hsMaths = 3;
        double hsPhys = 2;
        double hsChemistry = 2;
        System.out.println("Average Score " + (((maths * hsMaths) + (phys * hsPhys) + (chemistry * hsChemistry)) / 7));
    }

    public static void calculateCircle() {
        int r = 5;
        double c = (r * 2) * Math.PI;
        System.out.println("S is " + (r * r * Math.PI));
        System.out.println("C is " + c);

    }

    public static void LicensePlate() {
        int number = 6339;
        int tam;
        int sum = 0;
        while (number > 0) {
            tam = number % 10;
            sum = sum + tam;
            number = number / 10;
        }
        System.out.println(sum%10);
    }

    public static void minMax() {
        int a = 22;
        int b = 13;
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
