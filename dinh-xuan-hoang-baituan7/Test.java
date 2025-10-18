import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLy = new QuanLySach();

        System.out.println("==========================================");
        System.out.println("CHUONG TRINH QUAN LY SACH - TUAN 7");
        System.out.println("==========================================");

        // 1. TAO VA NHAP SACH GIAO TRINH TU BAN PHIM
        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh();
        sGiaoTrinh.nhapThongTin(scanner); 
        quanLy.themMoi(sGiaoTrinh);

        System.out.println("\n------------------------------------------");
        
        // 2. TAO VA NHAP SACH TIEU THUYET TU BAN PHIM
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet();
        sTieuThuyet.nhapThongTin(scanner);
        quanLy.themMoi(sTieuThuyet);

        // 3. Hien thi danh sach 
        quanLy.hienThiDanhSach(); 

        // 4. KIEM TRA GIAO DIEN (INTERFACE)
        System.out.println("\n--- KIEM TRA GIAO DIEN IKiemKe ---");
        
        // SỬA LỖI TẠI ĐÂY: Sửa thành IkiemKe (chữ I và K viết hoa)
        IkiemKe kiemKeGiaoTrinh = sGiaoTrinh; 
        
        int soLuongCan = 100;
        boolean duTonKho = kiemKeGiaoTrinh.kiemTraTonKho(soLuongCan);
        System.out.print("Kiem tra ton kho (SL >= " + soLuongCan + "): ");
        System.out.println(duTonKho ? "DU TON KHO" : "KHONG DU TON KHO");

        String viTriMoi = "Kho A1-Ke 5";
        kiemKeGiaoTrinh.capNhatViTri(viTriMoi);

        System.out.println("\n--- KIEM TRA CHUC NANG QUAN LY ---");
        
        // Vi du: Tim kiem
        System.out.print("Nhap ma sach can tim kiem: ");
        String maTimKiem = scanner.nextLine();
        Sach ketQuaTimKiem = quanLy.timKiemTheoMaSach(maTimKiem);
        
        if (ketQuaTimKiem != null) {
            System.out.println("-> Tim thay: " + ketQuaTimKiem.toString());
        } else {
            System.out.println("-> Khong tim thay sach co ma " + maTimKiem);
        }
        
        scanner.close();
        System.out.println("\nCHUONG TRINH KET THUC.");
    }
}