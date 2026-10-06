package Lab04;

public class Product {
    private String name;
    private double price;
    private double tax;

    public void nhapThongTin() {}
    public void xuatThongTin() {}
    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
