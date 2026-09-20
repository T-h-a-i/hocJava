package Lab03;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int soNguyen = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
//          System.out.println(soNguyen + " x " + i + " = " + soNguyen*i);   //Cách 1
            System.out.printf("%d x  %d = %d \n", soNguyen, i, soNguyen*i);  //Cách 2: khuyên dùng
        }
    }
}
