package Leetcode;

import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        var result = new SolutionOfRomanToInteger();
        result.romanToInt(Arrays.toString(new String[]{"IVV"}));

    }
}

class SolutionOfRomanToInteger {
    public int romanToInt(String s) {
        int counter = 0;
        for(int i =0;i<s.length();i++){

             if (s.charAt(i)=='I'){
                counter = counter+1;
            } else if (s.charAt(i)=='V') {
                 if (s.charAt(i-1)=='I'){
                     counter = counter+4;
                 }else
                counter = counter+5;

            } else if (s.charAt(i)=='X') {
                 if (s.charAt(i-1)=='I'){
                     counter = counter+9;
                 }else
                counter = counter+10;

            } else if (s.charAt(i)=='L') {
                 if (s.charAt(i-1)=='X'){
                     counter = counter+40;
                 }else
                counter = counter+50;

            }else if (s.charAt(i)=='C') {
                 if (s.charAt(i-1)=='X'){
                     counter = counter+90;
                 }else
                counter = counter+100;

            }else if (s.charAt(i)=='D') {
                 if (s.charAt(i-1)=='C'){
                     counter = counter+400;
                 }else
                counter = counter+500;

            }else if (s.charAt(i)=='M') {
                 if (s.charAt(i-1)=='C'){
                     counter = counter+900;
                 }else
                counter = counter+1000;

            }
        }


        return counter;
    }
}