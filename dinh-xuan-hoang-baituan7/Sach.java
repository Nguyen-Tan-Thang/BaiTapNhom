import java.util.Scanner;

public abstract class Sach {
    // Thuoc tinh
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    // Constructors 
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) { 
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    
    public abstract double tinhGiaBan(); 

    // Getter/Setter
    public void setMaSach(String maSach) { this.maSach = maSach; } 
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; } 
    public double getGiaCoBan() { return giaCoBan; }
    
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
        sc.nextLine(); // Xoa Enter
        
        // Xu ly nhap So luong (int)
        System.out.print("  > Nhap So luong (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("    Loi: So luong phai la so nguyen.");
            System.out.print("  > Nhap lai So luong (int): ");
            sc.next();
        }
        this.soLuong = sc.nextInt();
        sc.nextLine(); // Xoa Enter
        
        // Xu ly nhap Gia co ban (double)
        System.out.print("  > Nhap Gia co ban (double): ");
        while (!sc.hasNextDouble()) {
            System.out.println("    Loi: Gia co ban phai la so thuc.");
            System.out.print("  > Nhap lai Gia co ban (double): ");
            sc.next();
        }
        this.giaCoBan = sc.nextDouble();
        sc.nextLine(); // Xoa Enter
    }

    @Override
    public String toString() {
        return "Ma: " + maSach + ", Tieu de: " + tieuDe + ", Tac gia: " + tacGia + ", Nam XB: " + namXuatBan + ", SL: " + soLuong + ", Gia Co Ban: " + String.format("%,.0f", giaCoBan) + " VND";
    }
}