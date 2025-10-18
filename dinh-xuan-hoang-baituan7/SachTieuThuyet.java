import java.util.Scanner;

public class SachTieuThuyet extends Sach implements IkiemKe { 
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() { super(); }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan); 
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double phuPhi = this.laSachSeries ? 15000.0 : 0.0;
        return this.getGiaCoBan() + phuPhi;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.getSoLuong() >= soLuongToiThieu; 
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + this.getTieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("--- NHAP THONG TIN SACH TIEU THUYET ---");
        super.nhapThongTin(sc); 
        
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
               ", Gia Ban Uoc Tinh: " + String.format("%,.0f", tinhGiaBan()) + " VND" + 
               "]";
    }
}