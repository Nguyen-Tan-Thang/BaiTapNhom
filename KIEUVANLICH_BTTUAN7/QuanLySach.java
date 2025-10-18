import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    // Thêm sách mới
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("✅ Đã thêm sách: " + sach.getTieuDe());
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sachXoa = timKiemTheoMa(maSach);
        if (sachXoa != null) {
            danhSachSach.remove(sachXoa);
            System.out.println("🗑️ Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("⚠️ Không tìm thấy sách có mã: " + maSach);
        }
    }

    // Cập nhật số lượng
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sach = timKiemTheoMa(maSach);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            System.out.println("🔄 Đã cập nhật số lượng sách mã " + maSach);
        } else {
            System.out.println("⚠️ Không tìm thấy sách để cập nhật.");
        }
    }

    // Tìm kiếm theo mã
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // Hiển thị danh sách tất cả sách
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("📭 Danh sách sách trống!");
        } else {
            System.out.println("===== DANH SÁCH SÁCH =====");
            for (Sach sach : danhSachSach) {
                System.out.println(sach.toString());
                System.out.println("----------------------------");
            }
        }
    }
}
