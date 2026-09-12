package Lab01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();
        System.out.println("Your point is: ");
        int point = scanner.nextInt();
        System.out.println(name + " has point is: " + point);
    }
}
