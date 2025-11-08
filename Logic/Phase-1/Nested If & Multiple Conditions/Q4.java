// 4. Check if one of two given numbers is a multiple of the other.

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1:");
        int number1=sc.nextInt();
        System.out.print("Enter the number2:");
        int number2=sc.nextInt();

        if(number1==0 &&number2==0){
            System.out.println("zero is not nultiple of any number");
        }else if(number1%number2==0){
            System.out.println("number2 is multiple of number1");
        }else if(number2%number1==0){
            System.out.println("number1 is multiple of numbeer2");
        }else{
            System.out.println("neither one of number is multiple other number");
        }

        sc.close();
    }
    
}
