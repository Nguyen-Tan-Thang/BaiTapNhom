import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach quanLy = new QuanLySach();

        System.out.println("==========================================");
        System.out.println("CHUONG TRINH QUAN LY SACH - TUAN 6");
        System.out.println("==========================================");

        // 1. NHAP SACH GIAO TRINH TU BAN PHIM
        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh();
        sGiaoTrinh.nhapThongTin(scanner); 
        quanLy.themMoi(sGiaoTrinh);

        System.out.println("\n------------------------------------------");
        
        // 2. NHAP SACH TIEU THUYET TU BAN PHIM
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet();
        sTieuThuyet.nhapThongTin(scanner);
        quanLy.themMoi(sTieuThuyet);

        // 3. Hien thi danh sach sau khi nhap
        quanLy.hienThiDanhSach();

        // 4. Kiem tra chuc nang Quan ly
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

        // Vi du: Xoa
        System.out.print("Nhap ma sach can xoa: ");
        String maXoa = scanner.nextLine();
        quanLy.xoa(maXoa);
        
        // Hien thi lai danh sach sau khi xoa
        quanLy.hienThiDanhSach();
        
        scanner.close();
        System.out.println("\nCHUONG TRINH KET THUC.");
    }
}