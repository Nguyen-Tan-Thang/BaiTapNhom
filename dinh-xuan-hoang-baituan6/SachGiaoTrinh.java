import java.util.Scanner;

public class SachGiaoTrinh extends Sach { 
    private String monHoc;
    private String capDo;

    // Constructor mac dinh can thiet de nhap lieu
    public SachGiaoTrinh() { super(); }
    
    // Ghi de phuong thuc nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.println("--- NHAP THONG TIN SACH GIAO TRINH ---");
        super.nhapThongTin(sc); // Goi phuong thuc nhap thong tin chung tu lop cha
        
        System.out.print("  > Nhap Mon hoc (String): ");
        this.monHoc = sc.nextLine();
        
        System.out.print("  > Nhap Cap do (String): ");
        this.capDo = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Sach Giao Trinh: [" + 
               super.toString() + 
               ", Mon hoc: " + monHoc + 
               ", Cap do: " + capDo + 
               "]";
    }
}
    
