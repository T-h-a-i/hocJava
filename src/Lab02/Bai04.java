package Lab02;

import Lab01.Bai01;

import java.util.Scanner;

public class Bai04 {
    public static  void Bai01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.printf("Phương trình %dx + %d = 0 có vô số nghiệm", a, b);
        } else if (a == 0 && b != 0) {
            System.out.printf("Phương trình %dx + %d = 0 vô nghiệm", a, b);
        } else {
            float x = (float)-b / a;       // (float): để máy hiểu ta muốn kết quả ở định dạng nào(không có mặc định là int -> sai kq)
            System.out.printf("Phương trình %dx + %d = 0 có nghiệm là: %.3f", a, b, x);
        }
        scanner.close();
    }
    public static  void Bai02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 có vô số nghiệm", a, b, c);
            } else if (b == 0 && c != 0) {
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 vô nghiệm", a, b, c);
            } else {
                float x = (float) -c/b;
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 có nghiệm = %.3f", a, b, c, x);
            }
        } else {
            int delta = (int) Math.pow(b, 2) - 4*a*c;
            if (delta < 0) {
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 vô nghiệm", a, b, c);
            } else if (delta == 0) {
                float x = (float) -b/(2*a);
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 có nghiệm kép = %.3f", a, b, c, x);
            }else {
                double x1 = (((-b + Math.sqrt(delta))/(2*a)));    // sử dụng double do sqrt trả về kiểu double kphai float
                double x2 = (((-b - Math.sqrt(delta))/(2*a)));
                System.out.printf("Phương trình %dx^2 + %dx + %d = 0 có 2 nghiệm phân biệt là x1 = %.3f và x2 = %.3f", a, b, c, x1, x2);
            }
        }
        scanner.close();
    }
    public static  void Bai03() {
        System.out.println("Chương trình tính tiền điện");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        int soDien = scanner.nextInt();

        if (soDien <= 100) {
            int soTien = soDien * 1000;
            System.out.println("Số tiền điện cần trả là: " + soTien + " VND");
        } else {
            int soTien = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Số tiền điện cần trả là: " + soTien + " VND");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");
        int luaChon = scanner.nextInt();
        switch (luaChon) {
            case 1:
                //giải phương trình bậc 1
                Bai01();
                break;
            case 2:
                Bai02();
                break;
            case 3:
                Bai03();
                break;
            default:
                System.out.println("Bạn đã thoát chương trình");
                System.exit(0);
        }
        scanner.close();
    }
}
