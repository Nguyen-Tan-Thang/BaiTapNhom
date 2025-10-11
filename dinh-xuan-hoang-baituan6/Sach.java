import java.util.Scanner;

public class Sach {
    // Thuoc tinh private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructors 
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    // Getter/Setter
    public void setMaSach(String maSach) { this.maSach = maSach; } 
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    
    // Phuong thuc nhap thong tin tu ban phim (Da sua loi Scanner)
    public void nhapThongTin(Scanner sc) {
        // Nhap cac thuoc tinh String
        System.out.print("  > Nhap Ma sach (String): ");
        this.setMaSach(sc.nextLine());
        
        System.out.print("  > Nhap Tieu de (String): ");
        this.tieuDe = sc.nextLine();
        
        System.out.print("  > Nhap Tac gia (String): ");
        this.tacGia = sc.nextLine();
        
        // Xu ly nhap Nam xuat ban (int)
        System.out.print("  > Nhap Nam xuat ban (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("    Loi: Nam xuat ban phai la so nguyen.");
            System.out.print("  > Nhap lai Nam xuat ban (int): ");
            sc.next(); 
        }
        this.namXuatBan = sc.nextInt();
        sc.nextLine(); // Xoa Enter sau nextInt()
        
        // Xu ly nhap So luong (int)
        System.out.print("  > Nhap So luong (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("    Loi: So luong phai la so nguyen.");
            System.out.print("  > Nhap lai So luong (int): ");
            sc.next();
        }
        this.soLuong = sc.nextInt();
        sc.nextLine(); // Xoa Enter. Quan trong cho lop con.
    }

    @Override
    public String toString() {
        return "Ma: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia + ", Nam XB: " + namXuatBan + ", SL: " + soLuong;
    }
}