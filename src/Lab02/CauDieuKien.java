package Lab02;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        // if, else
        // Cú pháp: if (<điều kiện>){          *nếu điều kiện == true -> thực hiện công việc == false -> kiểm tra xuống các điều kiện ở dưới
        //              <công việc>
        //          } else if(<điều kiện>){    *else if dùng khi có nhiều hơn 2 điều kiện(có thể sử dụng nhiều lần)
        //              <công việc>
        //          } else (<điều kiện>){      *else(phủ định của if) sẽ chạy nếu tất cả các điều kiện trên đều không đúng
        //              <công việc>
        //          }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thuế: ");
        int thue = scanner.nextInt();
        if(thue < 10) {
            System.out.println("Không cần đóng thuế");
        } else if (10 <= thue && thue <= 15) {
            System.out.println("Thuế 10%");
        } else if (15 <= thue && thue <= 30) {
            System.out.println("Thuế 20%");
        } else {
            System.out.println("Thuế 50%");
        }
        scanner.close();
    }
}
