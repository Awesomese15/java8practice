package com.home;

import java.util.Optional;

public class Java8Optinal {

    public static  void main(String args []){
        String [] arrOfStrings= new String[8];
        arrOfStrings[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional <String> checkNull=Optional.ofNullable(arrOfStrings[5]);
        if(checkNull.isPresent()){
            String lowercaseString = arrOfStrings[5].toLowerCase();
            System.out.print(lowercaseString);
        }else {
            System.out.print("Value not present");
        }
        Optional<String> result = Optional.ofNullable(arrOfStrings[1]);
        System.out.println("Result of OF  "+result);
    }


}
