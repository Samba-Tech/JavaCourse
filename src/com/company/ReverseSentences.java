package com.company;

public class ReverseSentences {
    public static void main(String[] args){
        //Reversing the places of the word

       reverseString("Java is Fun");// You can call this method as many times as possible
        reverseString("JavaisFun");// There is only one word so no need to split and reverse
        reverseString("Java    is      Fun");
    }
    public static void reverseString(String str) {
        // converting Java is Fun .....Fun is Java
        String rev = " ";
        String[] xyz = str.split("\\s+");//symbol \\s is saying check the word if they have space if not put the space
        for(int i = xyz.length-1; i>=0; i--){// Any array always take normal length while string takes length()

            rev +=xyz[i] + " "; // the sentence to be reverse is always added to the last e.g is Fun + Java, Fun + is Java
        }
      System.out.println(rev);
        System.out.println(rev.trim());//trim cleans around the words
    }

}




