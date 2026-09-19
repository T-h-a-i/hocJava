package Lab02;

public class KieuDuLieu {
    public static void main(String[] args) {
        // I. Java Number: được chia thành 2 nhóm: số nguyên và số thực

        // 1. byte: khai báo giá trị nhỏ
        byte a = 100;    // nếu byte a = 1000; -> sẽ báo lỗi do vượt quá khoảng dữ liệu giới hạn
        // 2. short: = 2 bytes
        short b = 1000;  // nếu short b = 50000; -> tương tự trên
        // 3. int: = 4 bytes (HAY DÙNG)
        // 4. long: khi khai báo phải có chữ L ở cuối cùng số
        long c = 50000L;  // nếu ko có L ở cuối máy sẽ coi c là int nếu trong khoảng của int
        // 5. float / double: khác nhau ở chỗ lưu được nhiều ký tự thập phân hơn(sau dấu ,)
        float d = 1.25f;  // nếu không có f ở cuối thì sẽ tự coi là double
        double e = 10.66666d; // phải có d ở cuối

        // II. Boolen
        boolean myNameIsThai = true;  // hoặc false

        // III. Characters

        // 1. char: lưu trữ 1 ký tự duy nhất
        // 2. String (S viết hoa): lưu trữ chuỗi các ký tự
    }
}
