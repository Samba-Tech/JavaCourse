package com.company;

public class reverseWordInString {
    public static void main(String[] args){
        // reversing middle word of a string
        String word = "I LOVE JAVA";
        String subWord = word.substring(2,6);
        String subWordReverse = "";
        for(int i=subWord.length()-1; i>=0; i--){
            subWordReverse = subWordReverse + subWord.charAt(i);
        }
        String reverseWord = word.replace("LOVE", subWordReverse);
        System.out.println(reverseWord);
    }

         }

