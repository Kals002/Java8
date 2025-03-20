package java8.second.part;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Second
{
    public static void main(String[] args)
    {
        List<Student> studentList = Arrays.asList
                (
                        new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", 2014, "Mumbai", 122),
                        new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", 2018, "Delhi", 67),
                        new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", 2019, "Kerala", 164),
                        new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                        new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", 2022, "Mumbai", 12),
                        new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                        new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                        new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                        new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                        new Student(10, "Satyam", "Pandey", 26, "Male", "Biotech Engineering", 2017, "Mumbai", 98),
                        new Student(1, "Maya", "sharma", 30, "Female", "Mechanical Engineering", 2014, "Mumbai", 122)
                );

        //1. Group the students by department names.
//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.counting()))
//                .entrySet()
//                .forEach(System.out :: println);

        //3. Find all departments names.

//        studentList.stream()
//                .map(Student :: getDepartmentName)
//                .distinct()
//                .forEach(System.out :: println);

        //4. Find the list of students whose age is less than 25.

//        studentList.stream()
//                .filter(student -> student.getAge() < 25)
//                .forEach(System.out :: println);

        //5. Find the max age of students.

//        System.out.println(studentList.stream()
//                .sorted(Comparator.comparing(Student :: getAge).reversed())
//                .findFirst()
//                .get());

//        System.out.println(studentList.stream()
//                .map(Student :: getAge)
//                .mapToInt(age -> age)
//                .max()
//                .getAsInt());

        //6. Find max age from each department.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.maxBy(Comparator.comparing(Student :: getAge))))
//                .entrySet()
//                .forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue().get().getAge()));

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student :: getAge)), Optional :: get)))
//                .entrySet()
//                .forEach(System.out :: println);

        //6. Find the average age of male and female students.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getGender, Collectors.averagingInt(Student :: getAge)))
//                .entrySet()
//               .forEach(System.out :: println);

        //7. Find the young student in all departments.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.minBy(Comparator.comparing(Student :: getAge))))
//                .entrySet()
//                .forEach(e -> System.out.println(e.getKey()+" - "+e.getValue().get().getAge()));

        //8. Find the senior female student in all departments.

//        System.out.println(studentList.stream()
//                .filter(student -> student.getGender().equalsIgnoreCase("female"))
//                .max(Comparator.comparing(Student :: getAge))
//                .get());


//        studentList.stream()
//                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.maxBy(Comparator.comparing(Student :: getAge))))
//                .entrySet()
//                .forEach(System.out :: println);

        //10. Find the department who is having maximum number of students.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(3)
//                .forEach(System.out :: println);

        //11. Find the Students who stays in Mumbai and sort them by their names.

//        studentList.stream()
//                .filter(student -> student.getCity().equalsIgnoreCase("Mumbai"))
//                .map(Student :: getFirstName)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out :: println);


        //13. Find the average rank in all departments.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.averagingInt(Student :: getRank)))
//                .entrySet()
//                .forEach(System.out :: println);

        //14. Find the highest rank in each department.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.maxBy(Comparator.comparing(Student :: getRank))))
//                .entrySet()
//                .forEach(student -> System.out.println(student.getKey()+" - "+student.getValue().get().getFirstName()));

        //17. Find the ranks of students in all department in ascending order.

//        studentList.stream()
//                .collect(Collectors.groupingBy(Student :: getDepartmentName, Collectors.collectingAndThen(Collectors.toList(),
//                        student ->
//                                                student.stream()
//                                                        .sorted(Comparator.comparing(Student :: getRank).reversed())
//                                                        .collect(Collectors.toList())
//                                        )))
//                .entrySet()
//                .forEach(System.out :: println);

        // Convert to map
        String input = "neeraj:Srivastava,akash:sen,raj:sri,akash:sen";

//        Map<String, String> map7 = Arrays.stream(input.split(","))
//                .map(str -> str.split(":"))
//                .collect(Collectors.toMap(key -> key[0], value -> value[1], (key, value) -> value, HashMap :: new));
//
//      Map<String, String> map7 = Arrays.stream(input.split(","))
//              .map(e -> e.split(":"))
//              .collect(Collectors.toMap(key -> key[0], value -> value[1], (key, value) -> key,HashMap :: new));
// System.out.println(map7);





















    }
}
