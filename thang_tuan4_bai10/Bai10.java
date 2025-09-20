import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("Danh sach ban dau: " + list);

        System.out.print("Nhap vi tri muon them: ");
        int posAdd = sc.nextInt();
        System.out.print("Nhap gia tri muon them: ");
        int valAdd = sc.nextInt();
        list.add(posAdd, valAdd);
        System.out.println("Sau khi them: " + list);

        System.out.print("Nhap vi tri muon xoa: ");
        int posRemove = sc.nextInt();
        list.remove(posRemove);
        System.out.println("Sau khi xoa: " + list);

        sc.close();
    }
}
