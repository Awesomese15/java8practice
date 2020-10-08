package com.home;

public class DividedByTwoException extends Exception {
    public DividedByTwoException(String s) {
        super(s);
    }
}

class DrievrClass{
    public static void main(String args []){
        int a=12;
        int b=2;
        int result=1;


        if(b==2){
            try {
                throw new DividedByTwoException("DIVISION BY 2 IS NOT ALLOWED");
            } catch (DividedByTwoException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(a/b);
        }

    }
}
