package Package;

// Encapsulation:
// 1. Should not be able to change
// instance variables directly

// 2. make instance variables private

// 3. Use methods to get or set values
//    Getter & Setter methods


    public class Student {
        private String name;
        private String email;
        private double cgpa;
        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setCgpa(double cgpa){
            if(cgpa>=0 && cgpa<=4.0)
                this.cgpa = cgpa;
        }

        public Student(String name, String email, double cgpa, int id){
            this.name = name;
            this.email = email;

            if(cgpa>=0 && cgpa<=4.0)
                this.cgpa = cgpa;

            this.id = id;
        }
    }


