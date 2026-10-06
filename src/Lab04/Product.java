package Lab04;

public class Product {
    //1.Khai báo các thuộc tính
    private String name;
    private double price;
    private double tax;

    //2.Khởi tạo các hàm tạo để sử dụng ở các file khác
    public Product() {

    }

    public Product(String name, double price, double tax) {         //hàm tạo này lấy tham số đầu vào của nó để gán vào Product
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    //3. Khai báo các getter và setter để nơi khác sử dụng
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    //4. Viết các function (hàm tạo/in ra giá trị/tính toán)
    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }
    public void xuatThongTin(Product pr) {
        System.out.println("name  = " + pr.getName() + " price = " + pr.getPrice() + " tax = " + pr.getTax());   //ko dung .name vì sau này có thể sẽ sử dụng hàm này ở 1 nơi khác khi đó name đang là private sẽ báo lỗi và ko sử dụng được
    }
    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
