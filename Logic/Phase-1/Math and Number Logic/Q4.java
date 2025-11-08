// Check whether a given integer is single-digit, double-digit, or multi-digit.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number=sc.nextInt();

        int count=0;

        while(number!=0){
            int digit=number%10;
            number=number/10;
            count++;
        }

        if(count==1){
            System.out.println("Single-Digit");
        }else if(count==2){
            System.out.println("Double-Digit");
        }else{
            System.out.println("Multi-Digit");
        }
        sc.close();
    }
    
}
