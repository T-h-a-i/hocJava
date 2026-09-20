package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] mang = new int[size];
        System.out.println("Nhập vào các phần tử của mảng: ");

        for (int i= 0; i < size; i++){
            mang[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(mang));
        System.out.println("Max = " + mang[mang.length - 1]);
        System.out.println("Min = " + mang[0]);

        scanner.close();
    }
}
