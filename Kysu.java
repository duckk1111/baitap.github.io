public class Kysu extends Person{
    private String Major;
    public Kysu(String name, int age, String sexual, String major) {
        super(name, age, sexual);
        this.Major = major;
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor (String major) {
        this.Major = major;
    }
    @Override 
    public String toString() {
        return super.toString() + ", Bac: " + Major;
    }
}
