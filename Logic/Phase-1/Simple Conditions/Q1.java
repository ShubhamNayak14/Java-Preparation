// Take a number and print whether it’s positive, negative, or zero.
// (If–Else, Boolean Logic)

import java.util.*;

public class Q1{
    public static void main(String Arg[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        if(number==0){
            System.out.println("Inputed Number is Zero!");
        }else if(number>0 && number!=0){
            System.out.println("Inputed Number is Positive!"+" "+number);
        }else{
            System.out.println("Inputed Number is Negative!"+" "+number);
        }
        sc.close();

    }
}