package Lab04;

public class Class_Method {
    int sum(int a, int b) {                         // method int -> trả về(return) int
        return a+b;
    }
    public static void main(String[] args){
        Class_Method test = new Class_Method();      //tạo ra đối tượng cụ thể từ class Class_Method
        int a = test.sum(6, 9);
        System.out.println("Sum = " + a);
    }
}
