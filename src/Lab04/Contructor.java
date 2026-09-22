package Lab04;

public class Contructor {
    public static void main(String[] args) {
        Student st1 = new Student();  //giá trị của hàm htai là rỗng              //contructor: hàm tạo: nơi khởi tạo giá trị ban đầu cho class
        System.out.println("Check object: " + st1.name);  //rs: null do chưa gán gtri -> hàm tạo sinh ra để làm điều này

        Student st2 = new Student("Thái", 19);
        System.out.println("Check object: " + st2.name + " and age = " + st2.age);
    }
}
