public class Person {
    private String name;
    private int age;
    private String sexual;
    public Person(String name, int age, String sexual) {
        this.name = name;
        this.age = age;
        this.sexual = sexual;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSexual() {
        return sexual;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSexual(String sexual) {
        this.sexual = sexual;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Sexual Orientation: " + sexual;
    }
}




