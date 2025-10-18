public abstract class Sach {
    // Thuộc tính (private để thể hiện tính đóng gói)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // thêm thuộc tính mới

    // Constructor không tham số
    public Sach() {
    }

    // Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    // Phương thức trừu tượng (bắt buộc lớp con phải triển khai)
    public abstract double tinhGiaBan();

    // Hiển thị thông tin chung
    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               "\nTiêu đề: " + tieuDe +
               "\nTác giả: " + tacGia +
               "\nNăm xuất bản: " + namXuatBan +
               "\nSố lượng: " + soLuong +
               "\nGiá cơ bản: " + giaCoBan + " VNĐ";
    }
}
