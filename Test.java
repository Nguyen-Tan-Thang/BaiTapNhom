// Lớp Test để tạo đối tượng và kiểm thử lớp Sach
public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Sach bằng constructor có tham số
        Sach sach1 = new Sach("B001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 10);

        // Tạo đối tượng Sach bằng constructor không tham số + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu và Giải thuật");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(5);

        // Hiển thị thông tin các sách
        System.out.println("=== Thông tin sách 1 ===");
        sach1.hienThiThongTin();

        System.out.println("=== Thông tin sách 2 ===");
        sach2.hienThiThongTin();
    }
}
