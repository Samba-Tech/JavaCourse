package com.company;

public class OccurrenceOfWord {

    public static void main(String[] args){

        String str = "Spring is beautiful but so is summer";
        String word = "is";
        String[] temp = str.split(" ");
        int count = 0;
        for(int i= 0; i<temp.length; i++){//use to find if the word is available in temp
            //Each time it happens, count is incremented by 1
            if(word.equals(temp[i]))
                count++;


        }
        System.out.println("The string word is: " + str );
        System.out.println("The word " + word + " occurs " + count + " times in the above string");
    }
}
