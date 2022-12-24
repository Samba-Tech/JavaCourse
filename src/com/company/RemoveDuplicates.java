package com.company;

public class RemoveDuplicates {

    public static void main(String[] args){
        String str = "Programming";
        char[] sb = str.toCharArray();
        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i<sb.length; i++){
            boolean rep = false;
            for(int j = i+1; j<sb.length; j++){
                if(sb[i]== sb[j]){
                    rep = true;
                    break;
                }

            }
            if(!rep){
                sb1.append(sb[i]);
            }
        }
        System.out.println(sb1);
    }
}
