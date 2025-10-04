import java.util.Scanner;

public class BaiThuchan {
    
    // Lop Sach (Book) voi tinh dong goi
    public static class Sach {
        
        // Thuoc tinh private
        private String maSach;
        private String tieuDe;
        private String tacGia;
        private int namXuatBan;
        private int soLuong;

        // Constructor khong tham so
        public Sach() {
        }

        // Constructor day du tham so (Tuy chon)
        public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
            this.maSach = maSach;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
            this.namXuatBan = namXuatBan;
            this.soLuong = soLuong;
        }

        // Getter va Setter (Dong goi)
        public String getMaSach() { return maSach; }
        public void setMaSach(String maSach) { this.maSach = maSach; }

        public String getTieuDe() { return tieuDe; }
        public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

        public String getTacGia() { return tacGia; }
        public void setTacGia(String tacGia) { this.tacGia = tacGia; }

        public int getNamXuatBan() { return namXuatBan; }
        public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

        public int getSoLuong() { return soLuong; }
        public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

        // Phuong thuc hienThiThongTin()
        public void hienThiThongTin() {
            System.out.println("--- THONG TIN SACH ---");
            System.out.println("Ma sach: " + this.maSach);
            System.out.println("Tieu de: " + this.tieuDe);
            System.out.println("Tac gia: " + this.tacGia);
            System.out.println("Nam xuat ban: " + this.namXuatBan);
            System.out.println("So luong: " + this.soLuong);
            System.out.println("----------------------");
        }
        
        // Phuong thuc nhap thong tin tu ban phim
        public void nhapThongTin(Scanner sc) {
            System.out.println("\n--- NHAP THONG TIN SACH MOI ---");
            
            System.out.print("Nhap Ma sach (String): ");
            this.setMaSach(sc.nextLine());
            
            System.out.print("Nhap Tieu de (String): ");
            this.setTieuDe(sc.nextLine());
            
            System.out.print("Nhap Tac gia (String): ");
            this.setTacGia(sc.nextLine());
            
            // Nhap Nam xuat ban (int)
            System.out.print("Nhap Nam xuat ban (int): ");
            while (!sc.hasNextInt()) {
                System.out.println("Loi: Nam xuat ban phai la so nguyen.");
                System.out.print("Nhap lai Nam xuat ban (int): ");
                sc.next(); // Loai bo du lieu khong hop le
            }
            this.setNamXuatBan(sc.nextInt());
            sc.nextLine(); // Tiep tuc doc dong moi
            
            // Nhap So luong (int)
            System.out.print("Nhap So luong (int): ");
            while (!sc.hasNextInt()) {
                System.out.println("Loi: So luong phai la so nguyen.");
                System.out.print("Nhap lai So luong (int): ");
                sc.next(); // Loai bo du lieu khong hop le
            }
            this.setSoLuong(sc.nextInt());
            sc.nextLine(); // Tiep tuc doc dong moi
        }
    }
    
    // Lop Test (Chua logic nhap lieu va hien thi)
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Tao mot doi tuong Sach
        Sach sach1 = new Sach(); 
        
        // Goi phuong thuc de nhap du lieu tu ban phim
        sach1.nhapThongTin(scanner); 
        
        // Hien thi thong tin vua nhap
        System.out.println("\n== THONG TIN SACH VUA NHAP THANH CONG ==");
        sach1.hienThiThongTin();
        
        scanner.close();
    }
}