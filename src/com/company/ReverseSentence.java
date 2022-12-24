package com.company;

public class ReverseSentence {


    public static void main(String[] args) {

        String txt = "Have a nice day";

        // using Array to split the string
        String[] words = txt.split(" ");

        //using for each loop to reverse each word in the sentence by creating another object

        for (String each : words) {
            char[] chars = each.toCharArray(); // splitting each word to character

            for (int i = chars.length - 1; i >= 0; i--) { // Reversing the letters through loop


                System.out.print(chars[i]);//Replacing the reverse words with the original one

            }
            System.out.println(" ");

        }
// Reversing the sentence 'America is a great nation'
            String str = "America is a great nation";
            String[] result = str.split(" ");
            for(String each:result){
                char[] chars = each.toCharArray();
                for(int i = chars.length-1; i>=0; i--){

                    System.out.print(chars[i]);
                }
                    System.out.print(" ");



            }
// Reversing the sentence 'Little girl and magical Violin' with
        String hobby = "Little girl and magical Violin";
            String[] x = hobby.split(" ");
            for(String each: x) {
                char[] chars = each.toCharArray();
                for (int i= 0; i<= chars.length-1; i++) {// int i variable  is executed even before the loop begins
                    System.out.print(chars[i]);
                }
                System.out.print(" ");
            }
            for(String each:x){
                char[] ch = each.toCharArray();
                for(int i= ch.length-1; i>=0; i--){
                    System.out.print(ch[i]);
                }
                System.out.print(" ");
            }
        // Reversing the word 'Computer'
        String tool ="Computer";
           char[]ch = tool.toCharArray();
            for (int i = ch.length-1; i>=0; i--) {// int i variable  is executed even before the loop begins
           System.out.print(ch[i]);

            }

            System.out.print(" ");


        }
    }




