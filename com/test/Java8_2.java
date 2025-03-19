package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class Java8_2
{
    public static void main(String[] args)
    {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(76, "Mohan", "Polytechnic", 9));
        empList.add(new Employee(6, "Ravi", "Civil", 7));
        empList.add(new Employee(55, "John", "IT", 3));
        empList.add(new Employee(8, "Ramesh", "Civil", 5));
        empList.add(new Employee(34, "Mahesh", "Polytechnic", 10));

//        empList.stream()
//                .sorted(Comparator.comparing(Employee::getEmpGrade).reversed())
//                .forEach(e -> System.out.println(e));

//        empList.stream()
//                .collect(Collectors.groupingBy(Employee :: getEmpDeptName, Collectors.averagingInt(Employee :: getEmpGrade)))
//                .entrySet()
//                .forEach(System.out :: println);


//        empList.stream()
//                .collect(Collectors.groupingBy(Employee :: getEmpDeptName, Collectors.collectingAndThen(Collectors.toList(),
//                        e -> e.stream().sorted(Comparator.comparing(Employee :: getEmpGrade).reversed())
//                                .collect(Collectors.toList()))))
//                .entrySet()
//                .forEach(System.out :: println);

//        empList.stream()
//                .collect(Collectors.groupingBy(Employee ::getEmpDeptName, Collectors.maxBy(Comparator.comparing(Employee :: getEmpGrade))))
//                .entrySet()
//                .forEach(System.out :: println);

        Map<Employee, Integer> empMap = new HashMap<>();
        empMap.put(new Employee(76, "Mohan", "Polytechnic", 9), 87);
        empMap.put(new Employee(6, "Ravi", "Civil", 7), 8);
        empMap.put(new Employee(55, "John", "IT", 3), 35);
        empMap.put(new Employee(8, "Ramesh", "Civil", 5), 2);
        empMap.put(new Employee(34, "Mahesh", "Polytechnic", 10), 61);

//        empMap.keySet()
//                .stream()
//                .collect(Collectors.groupingBy(Employee :: getEmpDeptName, Collectors.summingInt(Employee :: getEmpGrade)))
//                .entrySet()
//                .forEach(System.out :: println);

//        empMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee :: getEmpDeptName).reversed()))
//                .forEach(System.out :: println);

//        empMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEach(System.out :: println);

        //FlatMap

        List<Integer> l1 = Arrays.asList(45, 99, 22, 4);
        List<Integer> l2 = Arrays.asList(51, 2, 96, 81, 33);
        List<Integer> l3 = Arrays.asList(5, 3, 76, 11);

        List<List<Integer>> clist = Arrays.asList(l1, l2, l3);
//        clist.stream()
//                .flatMap(e -> e.stream())
//                .forEach(e -> System.out.print(e+" "));
























    }
}
