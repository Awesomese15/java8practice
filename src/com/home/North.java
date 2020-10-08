/*
* You are given a String adeccccbba.
* Divide this in two not null parts. left=adecc & right=ccbba
* now make left part rigt and right part left
* then remove similar characters in the new string. meaning ccbbaadecc will be ccbbdecc=> ccbb && decc
* repeat steps 1-4. deccccbb will be bbde
* So final ans should be bbde coz bb && de has no similar suffix and prifix respectivelly

* */


package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class North {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN


        int lengthOfString = name.length();



       if (lengthOfString >1){
           boolean complete=false;
           String left=name.substring(0, lengthOfString/2);
           String right=name.substring((lengthOfString/2), lengthOfString);
            String temp="";
            temp=left;
            left=right;
            right=temp;

                while(left.charAt(left.length()-1)==right.charAt(0)){
                    int i=left.length()-1;
                    int k=0;
                   char commonChar=right.charAt(0);
                   while(left.charAt(i)==commonChar){
                       i--;
                   }
                   while (right.charAt(k)==commonChar){
                       k++;
                   }
                    String newLeft=left.substring(0,i+1);
                   String newRight=right.substring(k);

                    right=newLeft;
                    left=newRight;

                }

           System.out.println(left+right);

       }

    }
}