



public class circle {
    double bankinh;
    double Area() {
        return Math.PI * bankinh * bankinh ;
    }
    double Perimeter() {
        return 2 * Math.PI * bankinh;
    } 
    public static void main(String[] args) {
        circle circle = new circle();
        circle.bankinh = 4; 
        System.out.println("Dien tich la: " + circle.Area());
        System.out.print("Chu vi la: " + circle.Perimeter());
    }
}
