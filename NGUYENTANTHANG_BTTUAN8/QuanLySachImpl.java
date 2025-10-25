import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
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
