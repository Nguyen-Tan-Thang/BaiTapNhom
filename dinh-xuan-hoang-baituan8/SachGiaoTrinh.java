import java.util.Scanner;

public class SachGiaoTrinh extends Sach { 
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() { super(); }
    
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan); 
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Yeu cau 2: Trien khai tinhGiaBan() theo hop dong IGiaBan
    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - this.getNamXuatBan(); 
        return this.getGiaCoBan() + (soNam * 5000.0);
    }
    
    // Ghi de phuong thuc nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.println("--- NHAP THONG TIN SACH GIAO TRINH ---");
        super.nhapThongTin(sc); 
        
        System.out.print("  > Nhap Mon hoc (String): ");
        this.monHoc = sc.nextLine();
        
        System.out.print("  > Nhap Cap do (String): ");
        this.capDo = sc.nextLine();
    }

    // Yeu cau 2: Cap nhat toString()
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