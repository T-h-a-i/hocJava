package Lab03;

public class Loop {
    public static void main(String[] args){
        // for: lặp biết trước số lần
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        // while: lặp khi không biết trc số lần
//        int i = 9;
//        while (i < 6) {                         // điều kiện sai ngay lập tức dừng
//            System.out.println(i);
//            i++;
//        }
//
//        // do...while...: ngược với while và CHẠY ÍT NHẤT 1 LẦN
//        System.out.println("===========");
//        int k = 9;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k < 6);                       // dù điều kiện đúng hay sai vẫn in ra ít nhất 1 lần

        //break / continue : break để dừng lại ko chạy tiếp, continue để bỏ qua lần htai và chạy tiếp đằng sau
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("=========");
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                continue;
            }
            System.out.println(k);
        }
    }
}
