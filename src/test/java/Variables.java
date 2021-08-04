
import java.util.Calendar;


public class Variables {


    public static void main(String[] args) {
        //Age();
        //CaculateNumber();
        //calculateVAT();
        score();
    }

    public static void Age() {
        int year = 1989;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        System.out.println("Your age is " + age);
    }

    public static void CaculateNumber() {
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

    public static void score() {
        double maths = 8.5;
        double phys = 6;
        double chemistry = 4.5;
        double hsMaths = 3;
        double hsPhys = 2;
        double hsChemistry = 2;
        System.out.println("Average Score " + (((maths * hsMaths) + (phys * hsPhys) + (chemistry * hsChemistry)) / 7));
    }
    public static void abc(){

    }

}
