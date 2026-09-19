package Lab02;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        int day = 14;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Don't know");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Lựa chọn của bạn là : ");
        //code tiếp ở đây...
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Bạn lựa chọn phép cộng");
                break;
            case 2:
                System.out.println("Bạn lựa chọn phép trừ");
                break;
            default:
                System.out.println("Bạn lựa chọn thoát trương trình");
                System.exit(0);    // dùng để thoát trương trình ngay khi lựa chọn
        }
        int value1 = scanner.nextInt();  // dòng này để test System.exit(0);
        scanner.close();
    }
}
