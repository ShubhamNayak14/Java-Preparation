// Take three numbers and print the largest.

import java.util.*;
public class Q7{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1:");
        int Number1=sc.nextInt();
        System.out.print("Enter the number2:");
        int Number2=sc.nextInt();
        System.out.print("Enter the Number3:");
        int Number3=sc.nextInt();

        if(Number1>=Number2){
            if(Number1>=Number3){
                System.out.println(+Number1+" is Largest!");
            }else{
                 System.out.println(+Number3+" is Largest!");
            }
        }else{
            if(Number2>=Number3){
                 System.out.println(+Number2+" is Largest!");
            }else{
                 System.out.println(+Number3+" is Largest!");
            }
        }
        sc.close();

    }
}