package practice_1;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String []args){
        float f=0.122f;

//        String a = String.valueOf(f);
//
//        System.out.println(a);

        Scanner a1 = new Scanner(System.in);
        System.out.println("Mời nhập số n");
        String ch= a1.nextLine();
        int n =Integer.parseInt(ch);
        if(n>0){
            System.out.println("n là số nguyên dương " + n);
        }
        else {
            System.out.println("n là số âm");
        }
    }
}
