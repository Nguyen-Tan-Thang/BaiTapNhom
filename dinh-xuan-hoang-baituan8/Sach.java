import java.util.Scanner;

// Yeu cau 1: Sach implements ca IGiaBan va IKiemKe
public abstract class Sach implements IGiaBan, IKiemKe { 
    // Thuoc tinh
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // Yeu cau 1: Thuoc tinh giaCoBan

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
    
    // Yeu cau 2: tinhGiaBan() van la abstract vi logic khac nhau
    @Override
    public abstract double tinhGiaBan(); 

    // Yeu cau 2: Trien khai cu the cac phuong thuc IKiemKe tai lop cha
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) { 
        return this.getSoLuong() >= soLuongToiThieu; // Logic chung cho moi loai sach
    }

    @Override
    public void capNhatViTri(String viTriMoi) { 
        System.out.println("Da chuyen sach [" + this.getTieuDe() + "] den khu vuc: [" + viTriMoi + "]."); // Logic chung
    }
    
    // Getter/Setter (Hoan thien tinh dong goi)
    public void setMaSach(String maSach) { this.maSach = maSach; } 
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; } 
    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; } // Thêm Setter

    
    // Phuong thuc nhap thong tin tu ban phim
    public void nhapThongTin(Scanner sc) {
        System.out.print("  > Nhap Ma sach (String): ");
        this.setMaSach(sc.nextLine());
        
        System.out.print("  > Nhap Tieu de (String): ");
        this.tieuDe = sc.nextLine();
        
        System.out.print("  > Nhap Tac gia (String): ");
        this.tacGia = sc.nextLine();
        
        System.out.print("  > Nhap Nam xuat ban (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("    Loi: Nam xuat ban phai la so nguyen.");
            System.out.print("  > Nhap lai Nam xuat ban (int): ");
            sc.next(); 
        }
        this.namXuatBan = sc.nextInt();
        sc.nextLine(); // Xoa Enter
        
        System.out.print("  > Nhap So luong (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("    Loi: So luong phai la so nguyen.");
            System.out.print("  > Nhap lai So luong (int): ");
            sc.next();
        }
        this.soLuong = sc.nextInt();
        sc.nextLine(); // Xoa Enter
        
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