
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String calculator;
        float a,b;
        double pheptoan = 0;
        Scanner cal = new Scanner(System.in);
        System.out.println("Nhap dau de tinh diem: ");
        calculator = cal.next();
        System.out.println("Nhap a: ");
        a = cal.nextFloat();
        System.out.println("Nhap b: ");
        b = cal.nextFloat();
        switch (calculator) {
            case "+":
                pheptoan = a + b;
                break;
                case "-":
                pheptoan = a - b;
                break;
                case "*":
                pheptoan = a * b;
                break;
                case "/": 
                if (b == 0) {
                    System.out.println("Khong the chia het");
                } else {
                    pheptoan = a / b;
                }
                break;    
        }
        System.out.print("Dap an Thuc Hien Phep Toan la: " + pheptoan);
    }
}
