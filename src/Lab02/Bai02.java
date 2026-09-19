package Lab02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
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
}
