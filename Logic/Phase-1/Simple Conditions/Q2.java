// Check if a number is even or odd.

import java.util.*;
public class Q2{
    public static void main(String Arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();

    }
}