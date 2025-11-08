// Take two numbers and print the larger one

import java.util.*;
public class Q6{
    public static void main(String Arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1=sc.nextInt();
    
        System.out.print("Enter number2:");
        int number2=sc.nextInt();

        if(number1>number2){
            System.out.println("Number 1 is greater than number 2");
        }else{
            System.out.println("Number 2 is greater than number 1");
        }
        sc.close();
    }
}