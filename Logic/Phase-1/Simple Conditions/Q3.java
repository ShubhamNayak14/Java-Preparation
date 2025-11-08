// Check if a number is divisible by 5.

import java.util.*;
public class Q3{
    public static void main(String Arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();

        if(number%5==0){
            System.out.println("Number "+number+" is divisible by 5!");
        }else{
               System.out.println("Number "+number+" is not divisible by 5!");
        }
        sc.close();
    }
}