
//  3. Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String input= sc.nextLine();
        System.out.println(input);

        
        //calling the function
        isPangram(input);
    }

   public static void isPangram(String input) 
   {
        // Convert the input string to lowercase
        input = input.toLowerCase();
        int count=0;
        String missingchar="";
       

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input.indexOf(ch) == -1) {
               count++;
              missingchar= missingchar +ch +" ";
            }
        }
      

       if(count == 0 )
       {
          System.out.println("pangram");
        
       }
        else
        {
            System.out.println();
            System.out.println("not a pangram as the following characters are missing:");
            System.out.println(missingchar );
        }
        
    }
}

/* 
OUTPUT :

 enter the sentence :
Happy to be the part of Vandana Software Company.

The sentence is not a pangram as the following characters are missing:
g i j k l q u x z 

*/




