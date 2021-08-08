package practice_2;



import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        // printNumber();
        // printCharacter();
        //PTB1();
        //PTB2();
        sapXepMangTangDan();
        //tinhTienTaxi();
        //getMinvalue();
        //inSoNgayTrongThang();
        //kiemTraTamGiac();
    }


    public static void printNumber() {
        System.out.println("Mời nhập số");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7 || number == 8 || number == 9) {
            System.out.println("Só bạn nhâp là " + number);
        } else {
            System.out.println("Số bạn nhập không nằm trong khoảng 1->9");
        }
    }

    public static void printCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char c = sc.next().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("char is changed to UpperCase " + Character.toLowerCase(c));

        } else if (c >= 'a' && c <= 'z') {
            System.out.println("char is changed to  UpperCase " + Character.toUpperCase(c));
        } else {
            System.out.println("The character is invalid");
        }

    }

    public static void PTB1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("x = " + (float) a / b);
    }

    public static void PTB2() {
        Scanner scanner = new Scanner(System.in);
        float delta;
        double x1;
        double x2;
        System.out.println("Mời nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Mời nhập số c: ");
        int c = scanner.nextInt();
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm :");
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("X1 : " + x1);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("X2 : " + x2);
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = :" + (-b / (2 * a)));

        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }

    public static void getMinvalue() {
        System.out.println("Mời nhập số a ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Mời nhập số b");
        int b = scanner.nextInt();
        System.out.println("Mời nhập số c");
        int c = scanner.nextInt();
        System.out.println("Mời nhập số d");
        int d = scanner.nextInt();
        int min = a;
        if (b < min) {
            min = b;
        } else if (c < min) {
            min = c;
        } else if (d < min) {
            min = d;
        }
        System.out.println("số nhỏ nhất là: " + min);

    }

    public static void sapXepMangTangDan() {
        System.out.println("Mời nhập số a");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        System.out.println("Mời nhập số b");
        int b=n.nextInt();
        System.out.println("Mời nhập số c");
        int c=n.nextInt();
        System.out.println("Mời nhập só d");
        int d=n.nextInt();
        int temp;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        if(a>c){
            temp=b;
            b=c;
            c=temp;
        }
        if(a>d){
            temp=a;
            a=d;
            d=temp;
        }
        if(b>c){
            temp=b;
            b=c;
            c=temp;
        }
        if(b>d){
            temp=b;
            b=d;
            d=temp;
        }
        if(c>d){
            temp=c;
            c=d;
            c=temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void tinhTienTaxi() {
        System.out.println("Mời nhập số km");
        Scanner km = new Scanner(System.in);
        double kms = km.nextDouble();
        double price1 = 15000;
        double price2 = 13500;
        double price3 = 11000;
        double sum;
        double chietKhau = 0.1;
        if (kms < 2) {
            sum = kms * price1;
            System.out.println(sum);
        } else if (kms >= 2 && kms <= 5) {
            sum = (1 * price1) + (kms - 1) * price2;
            System.out.println("tien taxi : " + sum);
        } else if (kms >= 6 & kms <= 120) {
            sum = (1 * price1) + (4 * price2) + ((kms - 5) * price3);
            System.out.println("tien taxi :" + sum);
        } else if (kms > 120) {
            sum = (kms * price1) * chietKhau;
            System.out.println("tien taxi :" + sum);
        } else {
            System.out.println("The data input is invalid");
        }

    }

    public static void inSoNgayTrongThang() {
        System.out.println("Mời nhập số tháng");
        Scanner n = new Scanner(System.in);
        int m = n.nextInt();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("Tháng này có 31 ngày");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("Tháng này có 30 ngày");
        } else if (m == 2) {
            System.out.println("Tháng này có 28 ngày");
        } else {
            System.out.println("Tháng nhập không hợp lệ");
        }


    }

    public static void kiemTraTamGiac() {
        System.out.println("Mời nhập 3 cạnh của 1 tam giác");
        System.out.println("Mời nhập cạnh a");
        Scanner n = new Scanner(System.in);
        double a = n.nextDouble();
        System.out.println("Mời nhập cạnh b");
        double b = n.nextDouble();
        System.out.println("Mời nhập cạnh c");
        double c = n.nextDouble();
        if ((a + b > c || b + c > a || c + a > b) && (a > 0) && (b > 0) && (c > 0)) {
            System.out.println("là tam giác");
            if ((a == b) || (b == c) || (c == a)) {
                System.out.println("tam giác cân");
            } else if (a == b && b == c) {
                System.out.println("tam giác đều");
            } else if ((b * b + c * c == a * a) || (a * a + c * c == b * b) || (b * b + a * a == c * c)) {
                System.out.println("tam giác vuông");
            }
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }

}
