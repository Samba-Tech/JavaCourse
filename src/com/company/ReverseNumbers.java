package com.company;

public class ReverseNumbers {

   public static void main(String[] args){

       int number = 237560, reverse = 0;
       for(; number !=0; number=number/10) {
           int remainder = number % 10;
           reverse = reverse * 10 + remainder;
       }

    System.out.println("The reverse of the given number is: " + reverse);
   }
}
