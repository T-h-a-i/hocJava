package Lab04;

public class Student {

    // class attributes
    String name;                //Định nghĩa các thuộc tính
    int age;

    // Đây là 1 hàm tạo với giá trị rỗng
    public Student() {

    }
    // Tên hàm có thể giống nhau nhưng tham số truyền vào phải khác nhau
    public Student(String name1, int age1) {      //tên của hàm tạo TRÙNG với tên của Class
        this.name = name1;     // this.name/.age: là lấy thuộc tính của class và gán giá trị cho Class
        this.age = age1;       //Diễn tả: this.name / .age: cái thuộc tính(name/age)này(this) của class bao ngoài hàm( class Student) = giá trị này(name1/age1)
    }


    // class method: method tượng trưng cho hành động của object
    public void learnJava(){                             // Định nghĩa các hành vi
        System.out.println("Học java cùng Thai");        //method void: ko trả về j cả
    }
}
