
import java.util.Scanner;

class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diem;
        System.out.print("Nhap so diem: ");
        diem = sc.nextLine();
        // if (diem >= 8) {
        //     System.out.println("Hoc sinh gioi");
        // } else 
        // if (diem >= 6.5 ) {
        //     System.out.println("Hoc sinh kha");
        // } else 
        // if (diem >= 5) {
        //     System.out.println("Hoc sinh trung binh");
        // } else 
        // {
        //     System.out.println("Mày Ngu");
        // }
            switch (diem) {
                case "8":
                    System.out.println("hoc sinh gioi");
                    break;
                case "6":
                    System.out.println("Hoc sinh kha");
                break;
                case "5":
                    System.out.println("Hoc sinh Trung binh");
                break; 

                default:
                System.out.println("hoc sinh sucvat");
                break;
            }
    }
}