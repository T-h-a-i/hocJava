package Lab01;
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai hinh chu nhat: ");
        int chieuDai = scanner.nextInt();
        System.out.println("Chieu rong hinh chu nhat: ");
        int chieuRong = scanner.nextInt();
        int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        int canhMin = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        System.out.println("Cạnh Min: " + canhMin);
        scanner.close();
    }
}
