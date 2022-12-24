package com.company;

public class RightAngleStarPattern {

    public static void main(String args[]){

        int rows = 5;

        for(int i = 1; i<=rows; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }

     int row = 9;
        for (int i = 1; i<= row; i++){

            for( int s=i; s<=5-i; s++){ //taking care of the space//
              System.out.print(" ");

              for(int j=1; j<=i*2-1; j++);// taking care of the star//
              System.out.print("* ");
            }
            System.out.println();
        }
    }

}
