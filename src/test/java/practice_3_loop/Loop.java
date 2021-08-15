package practice_3_loop;

import java.util.Scanner;

public class Loop {
    public static void test(String[] args) {
        System.out.print("Mời nhập n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number is invalid");
        }
//         int s = sum(n);
//          System.out.println(s);
//
//        if (isPrimeNumber(n)) {
//            System.out.format("%d là số nguyên tố. \n", n);
//        } else {
//            System.out.format("%d không phải là số nguyên tố. \n", n);
//        }


//       if (kiemTraSoChinhPhuong(n)) {
//            System.out.println("Là só chính phương");
//        } else {
//            System.out.println("ko fai số chính phương");
//        }

        tinhGiaithua(n);
        tinhTongCacGiaiThua(n);
//             tinhTongSoNguyenTo(n);
//             xuatSoNguoc(n);
//              kiemTraSoDoiXung(n);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
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

    //kiem tra n co phai la so chinh phuong
    public static boolean kiemTraSoChinhPhuong(int n) {
        boolean ret = false;
        int temp = (int) Math.sqrt(n);
        if (temp * temp == n) {
            ret = true;
        }
        return ret;

    }

    //tinh giai thua
    public static int tinhGiaithua(int n) {
        int sum = 1;
        if (n == 0 || n == 1) {
            return sum;
        } else {
            for (int i = 2; i <= n; i++) {
                sum = sum * i;
            }
            return sum;
        }
    }

    //tinh tong giai thua S=1!+2!+3!...n!
    public static void tinhTongCacGiaiThua(int n) {
        int s = 0;
        {
            for (int i = 1; i <= n; i++) {
                s += tinhGiaithua(i);
            }
            System.out.format("Tổng các giai thừa %d là: %d ", n, s);
        }

    }

    //tính tổng số nguyên tố nhỏ hơn n
    public static void tinhTongSoNguyenTo(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    //Nhập số nguyên dương, xuất số ngược lại
    public static void xuatSoNguoc(int n) {
        int tam;
        int so = 0;
        while (n > 0) {
            tam = n % 10;
            so = so * 10 + tam;
            n = n / 10;
            System.out.print(tam);
        }

    }

    //kiem tra so doi xung
    public static void kiemTraSoDoiXung(int n) {
        int so;
        int sum = 0;
        int tam = n;
        while (n > 0) {
            so = n % 10;
            sum = (sum * 10) + so;
            n = n / 10;
        }
        if (tam == sum) {
            System.out.println("là số đối xứng ");
        }
    }
}
