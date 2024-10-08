    public class Nhanvien extends Person {
        private String job;
        
        public Nhanvien(String name, int age, String sexual, String job) {
            super(name, age, sexual);
            this.job = job;
        }
        public String getJob() {
            return job;
        }
        public void setJob(String job) {
            this.job = job;
        }
        @Override
        public String toString() {
            return super.toString() + ", Job: " + job;
        }
    }
