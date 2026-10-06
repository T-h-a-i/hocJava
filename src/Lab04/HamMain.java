package Lab04;

public class HamMain {
    public static void main(String[] args) {
        Product test = new Product();       //clone Class để sử dụng
        //Sau khi tạo 1 bản sao của Class đó thì có thể sử dụng các function đã được khai báo trong nó
        Product pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }
}
