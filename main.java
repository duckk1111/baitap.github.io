

public class main {
    public static void main(String[] args) {
        person person1 = new person();
        person1.namsinh = 2004;
        int tuoi = person1.PredictAge();
        System.out.println("So tuoi la: " + tuoi);
    }
}
