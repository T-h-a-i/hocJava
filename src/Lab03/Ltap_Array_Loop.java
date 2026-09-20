package Lab03;

import java.util.Arrays;

public class Ltap_Array_Loop {
    public static void main(String[] args) {
        // Sử dụng Arrays.sort()
        int[] clubs = {5, 4, 1, 18, 36};
        Arrays.sort(clubs);                         //Arrays.sort: sắp xếp theo thứ tự tăng dần(cả số và chữ)
        System.out.println(Arrays.toString(clubs));

        // Sx thủ công bằng vòng lặp
        int[] a = {15, 4, 1, 18, 36};
        for (int i = 0; i < a.length - 1; i++) {            //i=0: lấy phần tử ở VỊ TRÍ đầu tiên trong mảng a, i<a.length-1: sau sắp xếp phần tử cuối cùng 100% là max ko cần ss
            for (int j = i + 1; j < a.length; j++) {        //i=i+1: lấy phần tử liền sau a[i](i=0 -> j=1)
                if (a[i] > a[j]) {                          //nếu ptu ở vị trí i>j thì:
                    int temp = a[i];                        //khởi tạo 1 biến tạm thời = gtri ptu vị trí i
                    a[i] = a[j];                            //thay đổi giá trị của 2 vị trí cho nhau
                    a[j] = temp;                            //lặp đến khi hết vòng lặp trong ra vòng ngoài tiếp tục lấy phần tử ở vị trí liền sau để so sánh
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
