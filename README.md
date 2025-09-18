# BaiTapNhom
Đây là kho lưu trữ chứa bài tập nhóm môn TH LTHĐT, bao gồm code, tài liệu và báo cáo.
import java.util.Scanner;

public class TinhToanHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);

        // Kiểm tra tránh chia cho 0
        if (b != 0) {
            int thuong = a / b;  // chia lấy nguyên
            int du = a % b;      // chia lấy dư
            System.out.println("Thuong: " + thuong);
            System.out.println("Phan du: " + du);
        } else {
            System.out.println("Khong the chia cho 0!");
        }

        sc.close();
    }
}
