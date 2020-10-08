package com.home;

import java.util.function.Predicate;

public class Java8Predicate {
    public static void main (String args []){
        Predicate<Integer> checkNumber= integer -> (integer>18);
        Predicate<Integer> greaterThan= integer -> (integer>20);
        Predicate<Integer> smallerThan= integer -> (integer<31);
        System.out.println(checkNumber.test(10));
        boolean result= greaterThan.and(smallerThan).test(25);
        boolean result1= greaterThan.and(smallerThan).test(18);
        System.out.println(result);
        System.out.println(result1);

/*        String a="Hello";
        String b="Welcome";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());*/
    }
}
