import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println("Danh sach ban dau: " + numbers);

        System.out.print("Nhap vi tri muon them (bat dau tu 1): ");
        int posAdd = sc.nextInt() - 1;
        System.out.print("Nhap gia tri muon them: ");
        int valueAdd = sc.nextInt();

        if (posAdd >= 0 && posAdd <= numbers.size()) {
            numbers.add(posAdd, valueAdd);
            System.out.println("Danh sach sau khi them: " + numbers);
        } else {
            System.out.println("Vi tri them khong hop le!");
        }

        System.out.print("Nhap vi tri muon xoa (bat dau tu 1): ");
        int posRemove = sc.nextInt() - 1;

        if (posRemove >= 0 && posRemove < numbers.size()) {
            numbers.remove(posRemove);
            System.out.println("Danh sach sau khi xoa: " + numbers);
        } else {
            System.out.println("Vi tri xoa khong hop le!");
        }

        sc.close();
    }
}
