// package Codes.Logic.Phase-1.Math and Number Logic;
// Take a 3-digit number and check if all digits are distinct.


import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3-digit number:");
        int number=sc.nextInt();
        
        if(number<100 || number>999){
            System.out.println("Please enter 3 digit number");
        }else{
            int x=number/100;
            int y=(number/10)%10;
            int z=number%10;

            if(x==y &&y==z&&z==x){
                System.out.println("all digits are same");
            }else{
                System.out.println("all digits are distinct");
            }
        }

        sc.close();
    }
    
}
