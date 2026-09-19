package Lab03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // khai báo array(hard code):
        String[] clubs = {"MU", "MC", "Liverpool"};
        System.out.println("run here array" + Arrays.toString(clubs));   // Arrays.toString(array): dùng để hiển thị nội dung trong mảng
        // kiểm tra độ dài mảng
        System.out.println("run here arrat with length: " + clubs.length); //.length: là phương thức dùng để biết số lượng các phần tử trong mảng
        //truy cập phần tử trong mảng
        System.out.println("phần tử đầu tiên: " + clubs[0]);             // phần tử trong mảng được đếm bắt đầu từ 0
//        System.out.println("phần tử đầu tiên: " + clubs[5]);             //LỖI: do ko tồn tại vị trí thứ 5 trong mảng
        clubs[0] = "Arsenal";           // cập nhật lại phần tử thông qua index
        System.out.println("phần tử đầu tiên sau khi cập nhật: " + clubs[0]);

        // cách khai báo biên khác:
        String [] a = new String[5];
        a[0] = "1";
        System.out.println("phần tử đầu tiên của mảng a: " + a[3]);  //ko lỗi vì mảng có tồn tại index 3 nhưng chưa khai báo -> null

        //Duyệt tất cả các phần tử trong mảng(sử dụng LOOP)
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {           // sau này sẽ học forEach()
            System.out.println(cars[i]);
        }
    }
}
