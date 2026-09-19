package Lab02;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
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
}
