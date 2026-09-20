package Lab03;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số");
        int soNguyenTo = scanner.nextInt();

        int count = 0;
        for (int i = 2; i <= soNguyenTo - 1; i++) {
            if (soNguyenTo % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(soNguyenTo + " là số nguyên tố");
        } else {
            System.out.println(soNguyenTo + " không là số nguyên tố");
        }
        scanner.close();
    }
}
