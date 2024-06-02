
class datetime { 
    int HoursconvertToMinutes(int hours) {
        return hours * 60;
    }
    int DaysconvertToMinutes(int days) {
        return days * 24 * 60;
    }
    public static void main(String[] args) {
        datetime time = new datetime();
        System.out.println("Hours into Minutes: " + time.HoursconvertToMinutes(2) + " Minutes" );
        System.out.println("Days into Minutes: " + time.DaysconvertToMinutes(3) + " Minutes");
    }
}