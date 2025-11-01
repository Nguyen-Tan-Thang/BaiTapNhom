public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    // Constructor đầy đủ tham số (gồm cả lớp cha)
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    // Getter và Setter
    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    // Ghi đè phương thức tính giá bán
    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nMôn học: " + monHoc +
               "\nCấp độ: " + capDo +
               "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}
