import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }
        // Thêm phương thức mới
    public void hienThiSachKhuyenMai() {
        System.out.println("===== SÁCH CÓ KHUYẾN MÃI =====");
        for (Sach s : danhSach) {
            if (s instanceof IKhuyenMai) {
                IKhuyenMai km = (IKhuyenMai) s;
                if (km.kiemTraKhuyenMai()) {
                    System.out.println(s.getTieuDe() + " - Giá KM: " + 
                                     km.tinhGiaKhuyenMai(0.1) + " VNĐ");
                }
            }
        }
    }
    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void xoaSach(String maSach) {
        Sach sach = timKiemSach(maSach);
        if (sach != null) {
            danhSach.remove(sach);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }
            public void sapXepTheoGiaBan() {
        danhSach.sort((s1, s2) -> Double.compare(s1.tinhGiaBan(), s2.tinhGiaBan()));
        System.out.println("Đã sắp xếp theo giá bán!");
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
        } else {
            System.out.println("===== DANH SÁCH SÁCH =====");
            for (Sach s : danhSach) {
                System.out.println(s.toString());
                System.out.println("----------------------------");
            }
        }
    }
}
