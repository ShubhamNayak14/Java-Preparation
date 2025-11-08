// Take a 4-digit number and check if the first and last digits are equal.

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 4-Digit number:");
        int number=sc.nextInt();

        if(number<1000 || number>9999){
            System.out.println("Please enter the 4 digit number!");
        }else{
            int x=number%10;
            int y=number/1000;

            if(x==y){
                System.out.println("first and last digit is same");
            }else{
                System.out.println("first and last number is not same");
            }
        }

        sc.close();
    }
}
