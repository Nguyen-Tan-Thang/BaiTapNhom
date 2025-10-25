import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Yeu cau 4: Khoi tao doi tuong quan ly theo kieu Interface
        IQuanLySach quanLy = new QuanLySachImpl();
        QuanLySachImpl quanLyImpl = (QuanLySachImpl) quanLy; // Ep kieu de goi ham kiem tra demo

        System.out.println("==========================================");
        System.out.println("CHUONG TRINH QUAN LY SACH - TUAN 8");
        System.out.println("==========================================");

        int luaChon = -1;
        while (luaChon != 0) {
            quanLy.hienThiMenu();
            
            if (scanner.hasNextInt()) {
                luaChon = scanner.nextInt();
                scanner.nextLine(); // Xoa Enter
            } else {
                System.out.println("Loi: Vui long nhap mot so nguyen.");
                scanner.nextLine(); // Xoa input loi
                continue;
            }

            switch (luaChon) {
                case 1:
                    quanLy.themMoi(scanner);
                    break;
                case 2:
                    quanLy.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap Ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    Sach sachTim = quanLy.timKiemTheoMaSach(maTim);
                    if (sachTim != null) {
                        System.out.println("-> Tim thay: " + sachTim.toString());
                    } else {
                        System.out.println("-> Khong tim thay sach co ma: " + maTim);
                    }
                    break;
                case 4:
                    System.out.print("Nhap Ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    quanLy.xoa(maXoa);
                    break;
                case 5:
                    System.out.print("Nhap Ma sach can cap nhat So luong: ");
                    String maCapNhat = scanner.nextLine();
                    System.out.print("Nhap So luong moi (int): ");
                    int soLuongMoi = -1;
                    if (scanner.hasNextInt()) {
                        soLuongMoi = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Loi: So luong phai la so nguyen.");
                        scanner.nextLine();
                        break;
                    }
                    quanLy.capNhatSoLuong(maCapNhat, soLuongMoi);
                    break;
                case 6:
                    // Goi ham kiem tra demo
                    quanLyImpl.kiemTraKiemKeDemo(scanner);
                    break;
                case 0:
                    System.out.println("\nThoat chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
        scanner.close();
    }
} 