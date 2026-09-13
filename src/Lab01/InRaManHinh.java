package Lab01;

import java.util.Scanner;         // import thư viện Scanner

public class InRaManHinh {
    public static void main(String[] args) {
        // I.Có 3 loại print
        System.out.print("Tran Van Thai");        // 1. In thông thường (không xuống dòng)
        System.out.println("Hoc lap trinh Java"); // 2. In có xuống dòng

        // 3. In có định dạng(Cho phép chèn các giá trị của biến vào chuỗi hay viết trc khai báo sau, ko tự động xuôống dòng)
        System.out.printf("Thai co %d nguoi ban than", 3);  // %d: số nguyên
        System.out.printf("\n"); // \n: dùng để xuống dòng(có thể xuống dòng bên trong chuỗi)
        System.out.printf("So du tai khoan la %.3f", 300.12345);   // %f: số thực (%.nf: lấy n số thập phân)
        System.out.printf("\n");
        String ten = "Tae-Oh";
        int age = 19;
        System.out.printf("Toi ten la: %s, Tuoi: %d", ten, age);  // %s: chuỗi
        System.out.printf("\n");
        // II. Nhập input từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();          // nextLine(): nhận 1 dòng nhập từ bàn phím -> trả ra dữ liệu String
        System.out.println("Your age is: ");
        int tuoi = scanner.nextInt();              // nextInt(): nhận 1 số nguyên nhập từ bàn phím -> trả ra dữ liệu int
        System.out.println("My name is " + name + ", age = " + tuoi);
        scanner.close();       // Sau khi dùng tvien thì nên đóng lại
    }
}
