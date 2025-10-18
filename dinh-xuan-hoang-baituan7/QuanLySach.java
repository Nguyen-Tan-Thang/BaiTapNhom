import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach; 

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    public void themMoi(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("-> Da them sach: " + sach.getTieuDe());
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("\n*** Danh sach sach hien dang trong. ***");
            return;
        }
        System.out.println("\n*** DANH SACH TAT CA SACH ***");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString()); 
        }
    }

    public Sach timKiemTheoMaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    public void xoa(String maSach) {
        Sach sachCanXoa = timKiemTheoMaSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("-> Da xoa sach co ma " + maSach + " thanh cong.");
        } else {
            System.out.println("-> Khong tim thay sach co ma " + maSach + " de xoa.");
        }
    }
    
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMaSach(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("-> Da cap nhat so luong sach " + maSach + " thanh " + soLuongMoi);
        } else {
            System.out.println("-> Khong tim thay sach co ma " + maSach + " de cap nhat.");
        }
    }
}