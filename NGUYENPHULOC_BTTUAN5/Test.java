public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo sách giáo trình
        SachGiaoTrinh gt = new SachGiaoTrinh(
            "GT001", "Lap trinh Java", "Nguyen Van A", 2022, 10, "CNTT", "College"
        );

        // Tạo sách tiểu thuyết
        SachTieuThuyet tt = new SachTieuThuyet(
            "TT001", "Harry Potter", "J.K. Rowling", 2000, 5, "kỳ ảo ", true
        );

        // Thêm vào danh sách
        ql.themSach(gt);
        ql.themSach(tt);

        // Hiển thị danh sách
        ql.hienThiDanhSach();

        // Cập nhật số lượng
        ql.capNhatSoLuong("TT001", 8);

        // Xóa sách
        ql.xoaSach("GT001");

        // Hiển thị sau khi cập nhật
        ql.hienThiDanhSach();
    }
}
