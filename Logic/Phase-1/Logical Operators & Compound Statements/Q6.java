// 6. Take two numbers and check if both are positive and their sum is less than 100.

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1=sc.nextInt();
        System.out.print("Enter number2:");
        int number2=sc.nextInt();

        if(number1>=0 && number2>=0){
            if(number1+number2 <100){
                System.out.println("Both number positive and their sum is less than 100");
            }else{
                System.out.println("Both number positive and their sum is more than 100");
            }
        }else{
            System.out.println("numbers are not positive");
        }
        sc.close();
    }
    
}
