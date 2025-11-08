// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3-Digit number:");
        int number=sc.nextInt();

       

        if(number<100 || number>999){
            System.out.println("Please enter 3-Digit number!");
        }else{
            int x=number/100;
            int y=(number/10)%10;
            int z=number%10;

            if(x==y && y==z &&z==x){
            System.out.println("Neither");
            }

            if(y>x){
                if(y>z){
                    System.out.println("Largest");
                }else{
                    System.out.println("Neither");
                }
            }else{
                if(y<x){
                    if(y<z){
                        System.out.println("Small");
                    }else{
                        System.out.println("Neither");
                    }
                }
            }
        }
        sc.close();
    }
    
}
