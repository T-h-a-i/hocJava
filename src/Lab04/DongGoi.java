package Lab04;

public class DongGoi {
    //Đã sửa đổi file Student để sử dụng cho bài này
    public static void main(String[] args) {
        Student st1 = new Student();  //giá trị của hàm htai là rỗng              //contructor: hàm tạo: nơi khởi tạo giá trị ban đầu cho class

        Student st2 = new Student("Thái", 19);
        System.out.println("Check object: " + st2.getName() + " and age = " + st2.getAge());
        st2.setName("Thái new setName");    //setName: cập nhật lại name của Class Student
        System.out.println("Check object: " + st2.getName() + " and age = " + st2.getAge());
    }
}
