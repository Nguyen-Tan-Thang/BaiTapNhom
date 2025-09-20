import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a:");
        double a = scanner.nextDouble();

        System.out.println("Nhap so b:");
        double b = scanner.nextDouble();

        System.out.println("Nhap so c:");
        double c = scanner.nextDouble();

        double min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("So nho nhat la: " + min);

        scanner.close();
    }
}
