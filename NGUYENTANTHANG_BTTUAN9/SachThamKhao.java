
public class SachThamKhao extends Sach implements IKhuyenMai {
    private String linhVuc;
    private boolean laSachMoi;
    
    public SachThamKhao(String maSach, String tieuDe, String tacGia, int namXuatBan,
                       int soLuong, double giaCoBan, String linhVuc, boolean laSachMoi) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.linhVuc = linhVuc;
        this.laSachMoi = laSachMoi;
    }
    
    @Override
    public double tinhGiaBan() {
        double giaBan = getGiaCoBan() * 1.1; // Tăng 10%
        return laSachMoi ? giaBan + 20000 : giaBan;
    }
    
    @Override
    public double tinhGiaKhuyenMai(double tyLeKhuyenMai) {
        return tinhGiaBan() * (1 - tyLeKhuyenMai);
    }
    
    @Override
    public boolean kiemTraKhuyenMai() {
        return getSoLuong() > 50 || !laSachMoi;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
               "\nLĩnh vực: " + linhVuc +
               "\nSách mới: " + (laSachMoi ? "Có" : "Không") +
               "\nCó khuyến mãi: " + (kiemTraKhuyenMai() ? "Có" : "Không");
    }

    @Override
    public void capNhatViTri(String viTri) {
        // Implementation for updating the location
        System.out.println("Cập nhật vị trí sách tham khảo: " + viTri);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        // Implementation for checking inventory
        return getSoLuong() >= soLuongToiThieu;
    }
}
