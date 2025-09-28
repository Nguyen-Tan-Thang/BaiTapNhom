package bai1;

import java.util.Scanner;

public class HelloTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.println("Hello " + ten);

        scanner.close();
    }
}