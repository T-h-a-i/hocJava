package Lab04.AccessModifier.p1;

public class P1 {
    public static void main(String[] args) {
        P firstObj = new P();
        firstObj.a = 10;
        firstObj.b = 10;
        firstObj.c = 10;
        firstObj.d = 10;   //Lỗi: vì private chỉ cho sửa đổi và sử dụng ngay bên trong class chứa nó!
    }
}
