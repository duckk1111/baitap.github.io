
import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Nam Nhuan");
        } else {
            System.out.println("khong phai nam nhuan");
        }
    }
}
