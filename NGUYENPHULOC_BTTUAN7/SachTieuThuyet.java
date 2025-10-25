public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    // Constructor đầy đủ tham số
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    // Getter và Setter
    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    // Ghi đè phương thức tính giá bán
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nThể loại: " + theLoai +
               "\nLà sách series: " + (laSachSeries ? "Có" : "Không") +
               "\nGiá bán: " + tinhGiaBan() + " VNĐ";
    }
}
