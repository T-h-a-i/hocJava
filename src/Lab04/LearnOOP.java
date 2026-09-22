package Lab04;

public class LearnOOP {
    public static void main(String[] args) {
        System.out.println("Xin chào");
        Student st1 = new Student();                //Class là lớp tổng quát, Object là cụ thể, gán gtri cụ thể cho các thuộc tính tổng quát trong class
        st1.name = "Thái";
        st1.age = 19;

        Student st2 = new Student();
        st2.name = "Jin";
        st2.age = 36;

        System.out.println("Student with name = " + st1.name + " and age = " + st1.age);
    }
}
