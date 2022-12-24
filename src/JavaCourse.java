public class JavaCourse {
    public static void main(String[] args){

        String txt = "Have a nice day";

        // using Array to split the string
        String[] words = txt.split("");

        //using for each loop to reverse each word in the sentence by creating another object

        for(String each: words){
            char[] chars = each.toCharArray(); // splitting each word to character

            for(int i = chars.length-1; i>= 0; i--){ // Reversing the letters through loop

                System.out.println(chars[i]);//Replacing the reverse words with the original one

            }
            System.out.println(" ");

        }






        }



    }


