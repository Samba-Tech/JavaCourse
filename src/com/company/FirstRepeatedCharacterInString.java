package com.company;

public class FirstRepeatedCharacterInString {

    public static void main(String[] args){

        String str = "Good boy";
        boolean isFound = false;

        for(int i= 0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i)== str.charAt(j)){
                    System.out.println(str.charAt(i) + " is the first character that repeats");
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
    }
}
