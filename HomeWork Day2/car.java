

public class car {
    int speed = 0; 
    int upTo20() {
        speed += 20;
        return speed;
    }
    int upTo40() {
        speed += 40;
        return speed;
    }
    int upTo60() {
        speed += 60;
        return speed;
    }
    public static void main(String[] args) {
        car car1 = new car(); 
        System.out.println("Toc do lan thu nhat la: " + car1.upTo20() + "km/h");
        System.out.println("Toc do lan thu nhat la: " + car1.upTo40() + "km/h");
        System.out.println("Toc do lan thu nhat la: " + car1.upTo60() + "km/h");
        System.out.println("Toc do lan thu nhat la: " + car1.upTo20() + "km/h");
    }
}
