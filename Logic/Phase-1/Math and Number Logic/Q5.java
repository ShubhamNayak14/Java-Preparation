// Check if a number is a multiple of 7 or ends with 7.

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter a number:");
        int number=sc.nextInt();

        int lastdigit=0;

        lastdigit=number%10;

        if(number%7==0){
            if(lastdigit==7){
            System.out.println("Number end with 7");
            System.out.println("Multiple of 7");
            }else{
            System.out.println("Multiple of 7");

            }
        }else if(lastdigit==7){
            System.out.println("Number end with 7");
        }else{
            System.out.println("Not multiple of 7 and end with 7");
        }

        sc.close();
    }
}
