import java.util.ArrayList;
import java.util.List;

class QLNL {
        public List<Person> danhsachnhanhluc;

        public QLNL() {
            this.danhsachnhanluc = new ArrayList<>();
        }
        public void addPerson(Person person) { 
            danhsachnhanluc.add(person);
            System.out.println("Da Them" + person);

        }
        public void searchPerson(String name) { 
            for (Person person : danhsachnhanluc) {
                if (person.getName().equalsIgnoreCase(name)) {
                    System.out.println(person);
                    return;
                }
            }
            System.out.println("Không tìm thấy nhân lực nào có tên " + name);
        }
}


