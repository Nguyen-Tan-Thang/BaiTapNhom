import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Yeu cau 3: Lop trien khai IQuanLySach
public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSachSach; 

    public QuanLySachImpl() {
        this.danhSachSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("-> Da them sach: " + sach.getTieuDe());
    }
    
    // Them moi tong quat voi menu con
    @Override
    public void themMoi(Scanner sc) {
        System.out.println("--- CHON LOAI SACH CAN THEM ---");
        System.out.println("1. Sach Giao Trinh");
        System.out.println("2. Sach Tieu Thuyet");
        System.out.print("Nhap lua chon: ");
        
        int choice;
        while (!sc.hasNextInt() || (choice = sc.nextInt()) < 1 || choice > 2) {
            System.out.println("Loi: Lua chon khong hop le. Nhap lai (1 hoac 2): ");
            sc.nextLine(); // Xoa buffer
        }
        sc.nextLine(); // Xoa Enter
        
        Sach newSach = null;
        if (choice == 1) {
            newSach = new SachGiaoTrinh();
        } else {
            newSach = new SachTieuThuyet();
        }
        
        newSach.nhapThongTin(sc);
        this.themSach(newSach);
    }


    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("\n*** Danh sach sach hien dang trong. ***");
            return;
        }
        System.out.println("\n*** DANH SACH TAT CA SACH ***");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString()); 
        }
    }

    @Override
    public Sach timKiemTheoMaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    @Override
    public void xoa(String maSach) {
        Sach sachCanXoa = timKiemTheoMaSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("-> Da xoa sach co ma " + maSach + " thanh cong.");
        } else {
            System.out.println("-> Khong tim thay sach co ma " + maSach + " de xoa.");
        }
    }
    
    @Override
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach sachCanCapNhat = timKiemTheoMaSach(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setSoLuong(soLuongMoi);
            System.out.println("-> Da cap nhat so luong sach " + maSach + " thanh " + soLuongMoi);
        } else {
            System.out.println("-> Khong tim thay sach co ma " + maSach + " de cap nhat.");
        }
    }

    // Yeu cau 4: Hien thi Menu
    @Override
    public void hienThiMenu() {
        System.out.println("\n==========================================");
        System.out.println("QUAN LY SACH - CHUC NANG");
        System.out.println("1. Them sach moi");
        System.out.println("2. Hien thi tat ca sach");
        System.out.println("3. Tim kiem sach theo Ma");
        System.out.println("4. Xoa sach theo Ma");
        System.out.println("5. Cap nhat So luong sach");
        System.out.println("6. Kiem tra Ton kho (Demo Interface IKiemKe)");
        System.out.println("0. Thoat chuong trinh");
        System.out.print("-> Nhap lua chon cua ban: ");
    }
    
    public void kiemTraKiemKeDemo(Scanner sc) {
        System.out.print("Nhap Ma sach can kiem tra: ");
        String maSach = sc.nextLine();
        Sach sach = this.timKiemTheoMaSach(maSach);
        
        if (sach == null) {
            System.out.println("Khong tim thay sach co ma: " + maSach);
            return;
        }
        
        System.out.print("Nhap so luong toi thieu can co (int): ");
        while (!sc.hasNextInt()) {
            System.out.println("Loi: Phai nhap so nguyen.");
            System.out.print("Nhap lai so luong toi thieu: ");
            sc.next(); 
        }
        int soLuongToiThieu = sc.nextInt();
        sc.nextLine(); 

        // Su dung tham chieu IKiemKe (da duoc trien khai trong Sach)
        IKiemKe kiemKe = sach;
        
        boolean duTonKho = kiemKe.kiemTraTonKho(soLuongToiThieu);
        System.out.println("Ket qua kiem tra ton kho (SL >= " + soLuongToiThieu + "): " + (duTonKho ? "DU TON KHO" : "KHONG DU TON KHO"));

        System.out.print("Ban co muon cap nhat vi tri khong (Y/N)? ");
        String choice = sc.nextLine().trim().toUpperCase();
        if (choice.equals("Y")) {
            System.out.print("Nhap vi tri moi: ");
            String viTriMoi = sc.nextLine();
            kiemKe.capNhatViTri(viTriMoi);
        }
    }
}