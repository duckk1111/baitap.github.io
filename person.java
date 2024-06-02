


import java.time.LocalDate;


class person {
    int namsinh;
    public int PredictAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - namsinh;
    }    
}

