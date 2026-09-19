package Lab01;
import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh cua khoi lap phuong = ");
        int canh = scanner.nextInt();
        System.out.println("The tich hinh lap phuong la: " + Math.pow(canh, 3));   //pow: hàm mũ
        scanner.close();
    }
}
