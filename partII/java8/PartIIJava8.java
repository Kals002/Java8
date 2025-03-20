package partII.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PartIIJava8
{
    public static void main(String[] args)
    {
        //1. Count the occurrences of each word in a Array of strings using streams.

        String[] words= {"apple", "banana", "apple", "orange", "banana", "apple"};

//        Arrays.stream(words)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .forEach(System.out :: println);

//        String str = "apple banana apple orange banana apple";
//        Arrays.stream(str.split(" "))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .forEach(System.out :: println);

        //2.  Write a program to find the longest string in a list of strings using streams.

        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");

//        String reducedString = list.stream()
//                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
//                .get();
//        System.out.println(reducedString);

//       int maxLength = list.stream()
//                .map(String::length)
//                .mapToInt(e -> e)
//                .max()
//                .getAsInt();
//
//        System.out.println(list.stream()
//                .filter(e -> e.length() == maxLength)
//                .limit(1)
//                .findFirst()
//                .get());

//        System.out.println(list.stream()
//                .max(Comparator.comparing(String :: length))
//                .get());

        //3. Given a list of integers, remove duplicates and keep them in the descending order using streams.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

//        numbers.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .forEach(e -> System.out.print(e+" "));

        //4. Write a program to find the average of a list of doubles using streams.
        List<Double> doubles = Arrays.asList(1.2, 3.5, 2.8, 4.1, 5.7);

//        System.out.println(doubles.stream()
//                .mapToDouble(num -> num)
//                .average()
//                .getAsDouble());

        //5. Merge two lists of integers and remove duplicates using streams.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

//        Stream.concat(list1.stream(), list2.stream())
//                .distinct()
//                .forEach(e -> System.out.print(e+" "));

        //6. Given a list of strings, concatenate them into a single string using streams.
        List<String> list3 = Arrays.asList("Hello", " ", "world", "!");

//        String concat = list3.stream()
//                .collect(Collectors.joining());
//        System.out.println(concat);

        //7.  Write a program to find the first non-repeating character in a string using streams.
        String str1 = "abacdbef";

//        Arrays.stream(str1.split(""))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() == 1)
//                .limit(1)
//                .forEach(e -> System.out.println(e.getKey()));
        //System.out.println(String.join("", list3));

        //8.  Given a list of strings, remove all strings that contain a specific character using streams.
        List<String> list4 = Arrays.asList("apple", "banana", "Indi", "orange", "kiwia", "john");
        char specificChar = 'a';

//        list4.stream()
//                .filter(e -> !e.contains(String.valueOf(specificChar)))
//                .forEach(System.out :: println);

        //9. Given a list of integers, partition them into two groups: odd and even, using streams.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        numbers1.stream()
//                .collect(Collectors.partitioningBy(num -> num % 2 == 0))
//                .entrySet()
//                .forEach(System.out :: println);

        //10. Given an array of integers, find the kth largest element.
        List<Integer> list8= Arrays.asList(1, 12, 44, 32, 52, 81, 59, 84, 72, 37);
        int k = 4;

        //1 12 32 37 44 52 59 72 81 84

//        System.out.println(list8.stream()
//                .sorted()
//                .skip(list8.size() - k)
//                .findFirst()
//                .get());


        //12. Given a list of strings, find the count of strings starting with a vowels.
        List<String> list9 = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");

//        list9.stream()
//                .filter(str -> !"aeiouAEIOU".contains(String.valueOf(str.charAt(0))))
//                .forEach(System.out :: println);

        //13.Given a list of strings, find the longest palindrome string.
        List<String> list10 = List.of("level", "hello", "radar", "world", "madam", "java", "Malayalam");

//        list10.stream()
//                .map(String::toLowerCase)
//                .filter(str3 -> IntStream.rangeClosed(0, str3.length()/2)
//                                     .allMatch(f -> str3.charAt(f) == str3.charAt(str3.length() - f - 1)))
//                .forEach(System.out :: println);


        //14. Given a list of integers, find the product of all non-negative integers.
        List<Integer> integerList1 = Arrays.asList(4, 5, -6, 7, -1, 2, -3);

//        System.out.println(integerList1.stream()
//                .filter(e -> e < 0)
//                .reduce((a, b) -> a*b)
//                .get());

        //IMP questions

        // Q. Given a list of strings, find the longest common prefix using Java streams:

//        List<String> strings = Arrays.asList("flower", "flow", "floght");
//            String longs = strings.stream()
//                    .reduce((s1, s2) ->
//                    {
//                        int length = Math.min(s1.length(), s2.length());
//                        int index = 0;
//                        while(index < length && s1.charAt(index) == s2.charAt(index))
//                        {
//                            index++;
//                        }
//                        return s1.substring(0, index);
//                    }).orElse("");
//
//        System.out.println(longs);

        //Q. Implement a method to find all anagrams in a list of strings using Java streams:

        List<String> words1 = Arrays.asList("listen", "silent", "hello",
                "world", "night", "thing");

        //.stream()
//        words1.stream()
//                .collect(Collectors.groupingBy(str ->
//                {
//                    char[] charArray = str.toCharArray();
//                    Arrays.sort(charArray);
//                    return new String(charArray);
//                }))
//                .forEach((key, value) -> System.out.println(value));

        //Q. Find the number of occurrences of a given character in a list of strings using Java streams:

        List<String> strings1 = Arrays.asList("apple", "banana", "orange", "grape", "melon");
        char target = 'a';

//        System.out.println( strings1.stream()
//                .flatMap(e -> e.chars().mapToObj(g -> (char)g))
//                .filter(f -> f == target)
//                .count());

//        strings1.stream()
//                .flatMap(e -> e.chars().mapToObj(g -> (char)g))
//                .forEach(e -> System.out.print(e+" "));

























    }
}
