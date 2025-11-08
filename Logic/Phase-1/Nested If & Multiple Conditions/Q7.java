// Take two numbers and determine whether both are even, both are odd, or one is
// even and one is odd.

import java.util.*;
public class Q7{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number:");
        int number1=sc.nextInt();
        System.out.print("Enter a Second number:");
        int number2=sc.nextInt();

        if(number1%2==0 && number2%2==0){
            System.out.println("Both numbers are Even");
        }else if(number1%2==0 && number2%2!=0){
            System.out.println("one is even and one is odd.");
        }else if(number1%2!=0 && number2%2==0){
            System.out.println("one is odd and one is even.");
        }else if(number1%2!=0 && number2%2!=0){
               System.out.println("Both numbers are Odd");
        }
        sc.close();
    }
}