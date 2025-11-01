import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IQuanLySach quanLy = new QuanLySachImpl();

        int choice;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Thêm Sách Tham Khảo");
            System.out.println("4. Hiển thị danh sách sách");
            System.out.println("5. Tìm kiếm sách theo mã");
            System.out.println("6. Xóa sách theo mã");
            System.out.println("7. Hiển thị sách có khuyến mãi");
            System.out.println("8. Sắp xếp sách theo giá bán");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String maGT = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String tdGT = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tgGT = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namGT = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int slGT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaGT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mhGT = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cdGT = sc.nextLine();

                    SachGiaoTrinh gt = new SachGiaoTrinh(maGT, tdGT, tgGT, namGT, slGT, giaGT, mhGT, cdGT);
                    quanLy.themSach(gt);
                    break;

                case 2:
                    System.out.print("Nhập mã sách: ");
                    String maTT = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String tdTT = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tgTT = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namTT = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int slTT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaTT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tlTT = sc.nextLine();
                    System.out.print("Có phải sách series không (true/false): ");
                    boolean series = sc.nextBoolean();

                    SachTieuThuyet tt = new SachTieuThuyet(maTT, tdTT, tgTT, namTT, slTT, giaTT, tlTT, series);
                    quanLy.themSach(tt);
                    break;
                case 3:
                     System.out.print("Nhập mã sách: ");
                      String maSTK = sc.nextLine();
                        System.out.print("Nhập tiêu đề: ");
                        String tdSTK = sc.nextLine();
                        System.out.print("Nhập tác giả: ");
                    String tgSTK = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namSTK = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int slSTK = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaSTK = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Lĩnh vực: ");
                    String lvSTK = sc.nextLine();
                    System.out.print("Có phải sách mới không (true/false): ");
                    boolean moiSTK = sc.nextBoolean();

                    SachThamKhao stk = new SachThamKhao(maSTK, tdSTK, tgSTK, namSTK, slSTK, giaSTK, lvSTK, moiSTK);
                    quanLy.themSach(stk);
            break;
                case 4:
                    quanLy.hienThiDanhSach();
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach sachTim = quanLy.timKiemSach(maTim);
                    if (sachTim != null)
                        System.out.println(sachTim);
                    else
                        System.out.println("Không tìm thấy sách có mã: " + maTim);
                    break;

                case 6:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                    break;
                case 7:
                ((QuanLySachImpl) quanLy).hienThiSachKhuyenMai();
                break;
            
                case 8:
                ((QuanLySachImpl) quanLy).sapXepTheoGiaBan();
                break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    break;
                 
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 7);

        sc.close();
    }
}