import java.util.Scanner;

// Yeu cau 3: Giao dien cho cac chuc nang quan ly
public interface IQuanLySach {
    
    // Su dung Abstract Class Sach lam kieu du lieu
    void themMoi(Scanner sc); // Phuong thuc them moi tong quat
    
    void themSach(Sach sach); // Phuong thuc them sach da khoi tao
    
    Sach timKiemTheoMaSach(String maSach);
    
    void xoa(String maSach);
    
    void capNhatSoLuong(String maSach, int soLuongMoi);
    
    void hienThiDanhSach();
    
    void hienThiMenu();
}
