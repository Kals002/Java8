package com.test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8_1
{
    public static void main(String[] args)
    {
        /*
            Existing functional interfaces in Java
            1. Runnable  (run())
            2. Callable  (call())
            3. Comparator (compare())
            4. Comparable (compareTo())

            Marker interfaces
            1. Cloneable
            2. Serializable
            3. Remote

         */

        /*
            Java8 In built functional interfaces
            1. Predicate
            2. Consumer
            3. Function
            4. Supplier
            5. BiPredicate
            6. BiConsumer
            7. BiFunction
            8. UnaryOperator  (Special case of Function where input and output are same - T apply(T t) )
            9. BinaryOperator (Special case of BiFunction input, output are same - T apply(T t1, T t2) )
         */

        Predicate<String> predicate1 = e ->  e.length() > 5;
        boolean p1 = predicate1.test("John11");
        //System.out.println(p1);

        BiPredicate<String, String> bip = (e1, e2) -> e1.length() > e2.length();
        //System.out.println(bip.test("Joh", "Ram"));

        StringBuilder str = new StringBuilder("john");
        Consumer<StringBuilder> consumer1 = e -> e.append(" hello");
        consumer1.accept(str);
        //System.out.println(str);

        StringBuilder str1 = new StringBuilder("hello");
        StringBuilder str2 = new StringBuilder(" john");

        BiConsumer<StringBuilder, StringBuilder> bic = (e1, e2) -> e1.append(e2);
        bic.accept(str1, str2);
       // System.out.println(str1);
       // System.out.println(str2);

        Function<String, Integer> function = (e1) -> e1.length();
        //System.out.println(function.apply("John"));

        BiFunction<String, String, Integer> bif = (e1, e2) -> e1.length() + e2.length();
        //System.out.println(bif.apply("john", "david"));

        Supplier<Double> supplier = () -> Math.random();
       // System.out.println(supplier.get());

        StringBuilder sb = new StringBuilder("John");
        UnaryOperator<StringBuilder> unaryOperator = e1 -> e1.append(e1);
       // System.out.println(unaryOperator.apply(sb));

        StringBuilder sb1 = new StringBuilder("John");
        StringBuilder sb2 = new StringBuilder(" David");
        BinaryOperator<StringBuilder> binaryOperator = (e1, e2) -> e1.append(e2);
        //System.out.println(binaryOperator.apply(sb1, sb2));

    /*
        Intermediate operators - map, flatMap, filter, skip, sorted, distinct, limit, peek
        - Can be chained together (pipelined)
        - Lazy - They won't perform any action until terminal operator are called.

        Terminal operators - collect, reduce, anyMatch, allMatch, noneMatch, forEach, count.
        Identity function -  static utility method that returns a function that always returns its input argument.
                             If there is a need to input function then we can go for Identity function.
                          - list.stream().map(e -> e)
                          - list.stream().collect(Function.identity())
     */

        // 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> intList = Arrays.asList(21, 44, 90, 172, 2, 67, 61, 26, 118, 16, 13);

        List<Integer> evenList = intList.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        // 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<String> strList = Arrays.asList("21", "44", "90", "172", "2", "67", "61", "26", "118", "16");
       /* strList.stream()
                .filter(e -> e.startsWith("1"))
                .forEach(e -> System.out.println(e+" "));*/

        /*intList.stream()
                .map(e -> e+"")
                .filter(e -> e.startsWith("1"))
                .forEach(e -> System.out.println(e+" "));*/

        // 3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> intList1 = Arrays.asList(21, 44, 90, 172, 2, 67, 61, 26, 118, 16, 2, 172, 90, 61);
        Set<Integer> set = new HashSet<>();

       /* intList1.stream()
                .filter(e -> !set.add(e))
                .forEach(e -> System.out.print(e+" "));
        */

//        intList1.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .forEach(e -> System.out.print(e.getKey()+" "));

        // 4. Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> intList2 = Arrays.asList(21, 44, 90, 172, 2, 67, 61, 26, 118, 16, 172, 90, 61);
//        System.out.println(intList2.stream()
//                .findFirst().get());

        String str3 = "JavaProgramming";
//        Arrays.stream(str3.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
//                .entrySet()
//                .forEach(e -> System.out.print(e+" "));

        //6. Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> intList4 = Arrays.asList(21, 44, 90, 172, 2, 67, 61, 26, 118, 16, 172, 90, 61);
//        System.out.println(intList4.stream()
//                .mapToInt(e -> e)
//                .max()
//                .getAsInt());
//        System.out.println(intList4.stream()
//                .reduce((a,b) -> a > b? a :b).get());

        //7. Given a String, find the first non-repeated character in it using Stream functions?
        String s1 = "Hello java is functional programming H e ";
//        System.out.println(Arrays.stream(s1.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() == 1)
//                .findFirst()
//                .get()
//                .getKey());

        //9. Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(e -> System.out.print(e+" "));

        //11.  Write a Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        //System.out.println(Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList()));

//        FunctionInterface1 display = Java8_1::display;
//        display.add();

//    Stream.iterate(new int[]{0, 1}, e -> new int[]{e[1], e[0]+e[1]})
//            .mapToInt(e -> e[0])
//            .limit(10)
//            .forEach(e -> System.out.print(e+" "));

        //Factorial
        int num = 5;
//        /*System.out.println(IntStream.rangeClosed(1, num)
//                .reduce((a, b) -> a*b)
//                .getAsInt());*/

        //Prime
        int num1 = 31;
//        System.out.println(IntStream.rangeClosed(2, num1/2)
//                .noneMatch(e -> num1%e == 0));

        //Palindrome
        String str4 = "madam";
//        System.out.println( IntStream.rangeClosed(0, str4.length()/2)
//                .allMatch(e -> str4.charAt(e) == str4.charAt(str4.length() - e - 1)));

        //Anagrams

        String string1 = "Heart";
        String string2 = "Earth";

//        System.out.println(Arrays.stream(string1.split(""))
//                .map(String::toLowerCase)
//                .sorted()
//                .collect(Collectors.joining())
//                .equalsIgnoreCase(Arrays.stream(string2.split("")).map(String::toLowerCase).
//                sorted().collect(Collectors.joining())));

        //Convert to Map
        String input = "neeraj:Srivastava,akash:sen,raj:sri,akash:sen";
//        var collect = Arrays.stream(input.split(","))
//                .map(e -> e.split(":"))
//                .collect(Collectors.toMap(key -> key[0], value -> value[1],
//                        (key, value) -> key, HashMap::new));
//        System.out.println(collect);


    }

    public static void display()
    {
        System.out.println("static display method");
    }
}
