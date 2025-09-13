import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Bai4LaiSuat {

    // Ham tinh lai don: lai = goc * (r_nam/12) * soThang
    static double tinhLaiDon(double soTienGui, double laiSuatNam, int soThang) {
        double laiSuatThang = (laiSuatNam / 100.0) / 12.0;
        return soTienGui * laiSuatThang * soThang;
    }

    // Ham tinh lai kep: cuoi ky = goc * (1 + r_thang)^soThang
    static double tinhLaiKep(double soTienGui, double laiSuatNam, int soThang) {
        double laiSuatThang = (laiSuatNam / 100.0) / 12.0;
        return soTienGui * Math.pow(1 + laiSuatThang, soThang);
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("vi", "VN"));
        NumberFormat dinhDang = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap so tien gui (VND): ");
        double soTienGui = nhap.nextDouble();

        System.out.print("Nhap lai suat nam (%/nam): ");
        double laiSuatNam = nhap.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = nhap.nextInt();

        // Tinh lai don
        double tienLaiDon = tinhLaiDon(soTienGui, laiSuatNam, soThang);
        double tongDon = soTienGui + tienLaiDon;

        // Tinh lai kep
        double tongKep = tinhLaiKep(soTienGui, laiSuatNam, soThang);
        double tienLaiKep = tongKep - soTienGui;

        System.out.println("\n=== KET QUA ===");
        System.out.println(">> Cach 1 - Lai don:");
        System.out.println("  Tien lai:   " + dinhDang.format(tienLaiDon));
        System.out.println("  Tong cuoi ky: " + dinhDang.format(tongDon));

        System.out.println("\n>> Cach 2 - Lai kep:");
        System.out.println("  Tien lai:   " + dinhDang.format(tienLaiKep));
        System.out.println("  Tong cuoi ky: " + dinhDang.format(tongKep));

        nhap.close();
    }
}
