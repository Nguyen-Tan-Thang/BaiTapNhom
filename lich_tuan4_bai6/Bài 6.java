import java.util.Scanner;

public class Bai6 {
    // Hàm tìm UCLN bằng thuật toán Euclid
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tìm BCNN dựa vào UCLN
    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int x = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = sc.nextInt();

        int gcd = ucln(x, y);
        int lcm = bcnn(x, y);

        System.out.println("UCLN cua " + x + " va " + y + " la: " + gcd);
        System.out.println("BCNN cua " + x + " va " + y + " la: " + lcm);

        sc.close();
    }
}
