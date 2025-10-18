import java.util.Scanner;

public class SachGiaoTrinh extends Sach implements IkiemKe { 
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() { super(); }
    
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan); 
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - this.getNamXuatBan(); 
        return this.getGiaCoBan() + (soNam * 5000.0);
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
        System.out.println("--- NHAP THONG TIN SACH GIAO TRINH ---");
        super.nhapThongTin(sc); 
        
        System.out.print("  > Nhap Mon hoc (String): ");
        this.monHoc = sc.nextLine();
        
        System.out.print("  > Nhap Cap do (String): ");
        this.capDo = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Sach Giao Trinh: [" + 
               super.toString() + 
               ", Mon hoc: " + monHoc + 
               ", Cap do: " + capDo + 
               ", Gia Ban Uoc Tinh: " + String.format("%,.0f", tinhGiaBan()) + " VND" +
               "]";
    }
}