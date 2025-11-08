// Check if a number is divisible by both 3 and 5.

import java.util.*;
public class Q4{
    public static void main(String Arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();

        if(number%5==0 && number%3==0){
            System.out.println("Number is divisible by both 3 and 5");
        }else{
             System.out.println("Number is not divisible by both 3 and 5");
        }
        sc.close();

    }
}