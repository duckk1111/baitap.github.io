public class Congnhan extends Person {
    private String level;
    public Congnhan(String name, int age, String sexual, String level) {
        super(name, age, sexual);
        this.level = level;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String toString() {
        return super.toString() + ", Level: " + level;
    }
}