package com.company;

public class AnagramExample {

         static boolean isAnagramUsingStringMethods (String str1, String str2){
            if (str1.length() != str2.length())
                return false;

            else{
                char[] str1Array = str1.toCharArray();

                for(char ch : str1Array) {
                    int indexValue = str2.indexOf(ch);

                    // If index of any character is -1, then two strings are not anagram

                    if (indexValue == -1)
                        return false;
                    // if index of character is not equal to -1, then remove the character from the string

                    else{
                        str2 = str2.substring(0,indexValue) + str2.substring(indexValue +1, str2.length());
                    }
                }
            }
             return true;
         }
         public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println("race and care are anagrams :" + isAnagramUsingStringMethods(str1, str2));
    }
}






