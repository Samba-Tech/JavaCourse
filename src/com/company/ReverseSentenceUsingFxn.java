package com.company;

public class ReverseSentenceUsingFxn {
    // Creating a fxn/method to reverse a string

    public static String reverseString(String str){// String method created and str is the parameter from customer
        String rev = "";//creating an empty string  b/c we don't know the word
        for(int i= str.length()-1; i>= 0; i--){
            rev += (str.charAt(i));// container containing the loop output
        }
        return rev;

    }
    public static void main (String[] args){
        System.out.println(reverseString("Java is good"));

    }



}
