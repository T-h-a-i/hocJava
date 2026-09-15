package Lab02;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
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
}
