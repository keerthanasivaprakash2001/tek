package Streamlist;


    public class Employee1 {
        private String name;
        private String department;
        private String jobTitle;
        private int age;
        private int yearsOfExperience;
        private double salary;
        private int performanceRating;
        private boolean isPartTime;   // NEW FIELD

        public Employee1(String name, String department, String jobTitle,
                         int age, int yearsOfExperience, double salary,
                         int performanceRating, boolean isPartTime) {

            this.name = name;
            this.department = department;
            this.jobTitle = jobTitle;
            this.age = age;
            this.yearsOfExperience = yearsOfExperience;
            this.salary = salary;
            this.performanceRating = performanceRating;
            this.isPartTime = isPartTime;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public int getAge() {
            return age;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        public double getSalary() {
            return salary;
        }

        public int getPerformanceRating() {
            return performanceRating;
        }

        public boolean isPartTime() {
            return isPartTime;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", age=" + age +
                    ", yearsOfExperience=" + yearsOfExperience +
                    ", salary=" + salary +
                    ", performanceRating=" + performanceRating +
                    ", isPartTime=" + isPartTime +
                    '}';
        }
    }




