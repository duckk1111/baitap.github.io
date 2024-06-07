
import java.text.DecimalFormat;
import java.util.Scanner;

public class Bac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b ,c ;
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        System.out.println("Nhap c: ");
        c = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("##.###");
        float x1 ,x2 , x, d = b*b - 4 * a * c;
        if (d < 0 ) {
            System.out.println("Phuong Trinh Vo Nghiem");
        } else if (a == 0) {
            x = -c / b;
            System.out.print("Phuong trinh x1 = x2 = " + df.format(x));
        } else if (a == 0 && b ==0 ) {
            System.out.println("Phuong Trinh Vo So Nghiem");
        } else {
            x1 = (float) ((-b + Math.sqrt(d)) / (2 * a) );
            x2 = (float) ((-b - Math.sqrt(d)) / (2 * a) );
            System.out.print("Phuong Trinh co 2 nghiem la: x1:= " + df.format(x1) + " x2:= " + df.format(x2));
        }
    }
}
