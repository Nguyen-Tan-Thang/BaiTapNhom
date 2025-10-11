import java.util.Scanner;

public class SachTieuThuyet extends Sach { 
    private String theLoai;
    private boolean laSachSeries;

    // Constructor mac dinh can thiet de nhap lieu
    public SachTieuThuyet() { super(); }

    // Ghi de phuong thuc nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.println("--- NHAP THONG TIN SACH TIEU THUYET ---");
        super.nhapThongTin(sc); // Goi phuong thuc nhap thong tin chung tu lop cha
        
        System.out.print("  > Nhap The loai (String): ");
        this.theLoai = sc.nextLine();
        
        // Nhap boolean
        System.out.print("  > Sach co thuoc loai series khong (true/false): ");
        while (!sc.hasNextBoolean()) {
            System.out.println("    Loi: Phai nhap 'true' hoac 'false'.");
            System.out.print("  > Nhap lai (true/false): ");
            sc.next();
        }
        this.laSachSeries = sc.nextBoolean();
        sc.nextLine(); // Xoa Enter sau nextBoolean()
    }

    @Override
    public String toString() {
        String isSeries = laSachSeries ? "Co" : "Khong";
        return "Sach Tieu Thuyet: [" + 
               super.toString() + 
               ", The loai: " + theLoai + 
               ", Series: " + isSeries + 
               "]";
    }
}
