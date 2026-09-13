package Lab01;

import java.util.Scanner;

public class HamToanHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Min = " + Math.min(firstNumber, secondNumber));
        scanner.close();

        System.out.println("Hàm mũ: 2^3 = " + Math.pow(2, 3));
        System.out.println("Hàm căn bậc 2: căn bậc hai của 25 = " + Math.sqrt(25));
    }
}
