package Streamlist;

import java.util.List;

public class Employee1Main {

        public static void main(String[] args) {

            List<Employee1> employees = List.of(
                    new Employee1("Alice Johnson", "IT", "Manager", 38, 4, 120000, 4, false),
                    new Employee1("Bob Smith", "IT", "Developer", 29, 5, 125000, 5, false),
                    new Employee1("Charlie Davis", "HR", "Manager", 45, 18, 150000, 3, false),
                    new Employee1("Diana Patel", "Finance", "Analyst", 32, 7, 78000, 4, false),
                    new Employee1("Ethan Brown", "Sales", "Manager", 41, 2, 110000, 2, false),
                    new Employee1("Fiona Wilson", "Marketing", "Executive", 27, 3, 62000, 5, false),
                    new Employee1("George Miller", "IT", "Developer", 36, 10, 98000, 3, false),
                    new Employee1("Hannah Garcia", "HR", "Manager", 30, 6, 95000, 4, false),
                    new Employee1("Ian Thompson", "Finance", "Manager", 50, 3, 175000, 5, false),
                    new Employee1("Julia Roberts", "Sales", "Executive", 28, 4, 70000, 3, true),   // Part-time
                    new Employee1("Mike Thomas", "Marketing", "Assistant", 22, 1, 30000, 9, true), // Part-time
                    new Employee1("Sophia Turner", "Sales", "Clerk", 24, 2, 28000, 8, true)       // Part-time
            );




//            Write a program that reads a list of Employee objects from the user and performs the following operations:
//            Remove all employees who are part-time and have a salary less than 50,000, but are in the Sales or Marketing department.
//                    Calculate the sum of the salaries of the remaining employees, but only for those who have more than 3 years of experience.
//                    Find the average age of the remaining employees, but only for those who have a performance rating of at least 7.


            // Step 1: Remove part-time employees with salary < 50,000 in Sales or Marketing
            List<Employee1> filtered = employees.stream()
                    .filter(e -> !(e.isPartTime()
                            && e.getSalary() < 50000
                            && (e.getDepartment().equalsIgnoreCase("Sales")
                            || e.getDepartment().equalsIgnoreCase("Marketing"))))
                    .toList();

            System.out.println("After filtering employees:");
            filtered.forEach(System.out::println);

            // Step 2: Sum of salaries where experience > 3 years
            double salarySum = filtered.stream()
                    .filter(e -> e.getYearsOfExperience() > 3)
                    .mapToDouble(Employee1::getSalary)
                    .sum();

            System.out.println("\nTotal Salary of employees with experience > 3 years: " + salarySum);

            // Step 3: Average age where performance rating >= 7
            double avgAge = filtered.stream()
                    .filter(e -> e.getPerformanceRating() >= 7)
                    .mapToInt(Employee1::getAge)
                    .average()
                    .orElse(0);

            System.out.println("\nAverage Age (performance rating >= 7): " + avgAge);
        }
    }




