import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class bai8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> demPhanTu = new HashMap<>();

        for (int phanTu : arr) {
            demPhanTu.put(phanTu, demPhanTu.getOrDefault(phanTu, 0) + 1);
        }

        int phanTuNhieuNhat = 0;
        int soLanXuatHien = 0;

        for (Map.Entry<Integer, Integer> entry : demPhanTu.entrySet()) {
            if (entry.getValue() > soLanXuatHien) {
                soLanXuatHien = entry.getValue();
                phanTuNhieuNhat = entry.getKey();
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat la: " + phanTuNhieuNhat);
        System.out.println("So lan xuat hien la: " + soLanXuatHien);

        scanner.close();
    }

    @Override
    public String toString() {
        return "bai8 []";
    }
}
