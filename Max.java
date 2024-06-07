
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int max = 0;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();
        if (a > b && a > c ) {
            max = a; 
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.print("So lon nhat la: " + max);
    }
}
