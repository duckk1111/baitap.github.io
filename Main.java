
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLNL qlnl = new QLNL();
        Scanner scanner = new Scanner(System.in);

        Nhanvien nv = new Nhanvien("Nguyen Van A", 30, "Nam", "Ke Toan");
        Congnhan cn = new Congnhan("Tran Thi B", 28, "Nu", "4");
        Kysu ks = new Kysu("Le Van C", 35, "Nam", "Tu Dong hoa");

        qlnl.addPerson(nv);
        qlnl.addPerson(cn);
        qlnl.addPerson(ks);
        
        // Tìm kiếm theo họ tên
        System.out.print("Nhap ho ten can tim: ");
        String tenCanTim = scanner.nextLine();
        if (tenCanTim != null) {
            System.out.println("Da tim thay: " + tenCanTim);
        } else {
            System.out.println("Khong Tim Thay");
        }
        System.out.println("Danh sách nhan luc:");
        for (Person person : qlnl.danhsachnhanluc) {
            System.out.println(person);
        }
        System.out.println("----------------------------------------");
    }


}
