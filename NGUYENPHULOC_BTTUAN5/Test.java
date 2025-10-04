public class Test {
    public static void main(String[] args) {
        // Tao doi tuong sach bang constructor co tham so
        Sach sach1 = new Sach("S001", "Lap trinh Java co ban", "Nguyen Van A", 2022, 5);

        // Tao doi tuong sach bang constructor khong tham so va dung setter
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cau truc du lieu va giai thuat");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(3);

        // Hien thi thong tin sach
        sach1.hienThiThongTin();
        System.out.println();
        sach2.hienThiThongTin();
    }
}
