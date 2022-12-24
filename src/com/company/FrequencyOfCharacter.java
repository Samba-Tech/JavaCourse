package com.company;

public class FrequencyOfCharacter {

    public static void main(String[] args){

        String ads = "Simple mobile everywhere you go";

        char ch = 'e';

        int frequency = 0;

        for(int i = 0; i<ads.length(); i++){
            if(ch == ads.charAt(i)){
                frequency++;

            }

        }
        System.out.println("The frequency of " + ch + " = " + frequency);
    }
}
