package com.home;

import java.util.Objects;
import java.util.function.Predicate;

public class PrediacteAnd {
    public  static Predicate<String> hasLemngthof10= new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };

    public static  void pradiacte_and(){
        Predicate <String> notNullPredicate= Objects::nonNull;
        String nullString= null;
        boolean outcome= notNullPredicate.and(hasLemngthof10).test(nullString);
        System.out.println(outcome);
        String notNullString="Welcome to Thomas' home";
        boolean outcome2=  notNullPredicate.and(hasLemngthof10).test(notNullString);
        System.out.println(outcome2);
    }

    public static  void main(String args []){
        pradiacte_and();
    }
}
