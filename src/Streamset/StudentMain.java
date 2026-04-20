package Streamset;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

        public static void main(String[] args) {

            Set<Student> studentSet = new HashSet<>();
            studentSet.add(new Student("Aarav", "Computer Science", 20, 2, 3.8, 0));
            studentSet.add(new Student("Meera", "Biology", 19, 3, 3.4, 1));
            studentSet.add(new Student("Kiran", "Engineering", 21, 4, 3.6, 0));
            studentSet.add(new Student("Rahul", "Chemistry", 23, 5, 2.9, 2));
            studentSet.add(new Student("Sara", "Mathematics", 22, 1, 2.7, 3));
            studentSet.add(new Student("Nisha", "Mathematics", 24, 4, 3.2, 0));
            studentSet.add(new Student("David", "Computer Science", 25, 5, 3.9, 0));
            studentSet.add(new Student("Elena", "Engineering", 28, 7, 3.7, 0));
            studentSet.add(new Student("Zara", "Biology", 20, 2, 3.1, 0));
            studentSet.add(new Student("John", "Mathematics", 23, 3, 2.8, 3));
            studentSet.add(new Student("Mark", "Mathematics", 26, 6, 2.5, 5));
            studentSet.add(new Student("Lara", "Mathematics", 22, 2, 2.9, 2));
            studentSet.add(new Student("Anil", "Mathematics", 21, 3, 3.6, 0));
            studentSet.add(new Student("Rekha", "Mathematics", 24, 4, 3.7, 0));
            studentSet.add(new Student("Rohan", "Mathematics", 22, 2, 3.5, 1));


//            Write a program that reads a set of Student objects from the user and performs the following operations:
////            Filter out all students who have a GPA greater than 3.8 and are majoring in Biology, but have joined in the last 4 years and have a performance rating below 7.
////            Calculate the square root of the sum of the GPAs of the remaining students, but only for those who have an age above 30 and a GPA above 3.9.
////            Find the student with the closest age to the square root, but only if their major is Computer Science and they have a GPA above 4.2.
//////

            List<Student> filteredlist = studentSet.stream()
                    .filter(e -> !(e.getGpa() > 3.8
                            && e.getMajor().equalsIgnoreCase("biology")
                            && e.getYearsOfEnrollment() < 4))
                    .filter(e -> e.getAge() > 30 && e.getGpa() > 3.9).toList();

            double sum = filteredlist.stream().mapToDouble(Student::getGpa).sum();
            double sqrt = Math.sqrt(sum);


            Student result = filteredlist.stream().filter(e -> e.getMajor().equalsIgnoreCase("Computerscience")
                            && e.getGpa() > 4.2).min(Comparator.comparingDouble(e -> Math.abs(e.getAge() - sqrt)))
                    .orElse(null);

            System.out.println(result);







//



//






        }
    }

