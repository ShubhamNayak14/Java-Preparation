// Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'

import java.util.*;
public class Q8{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);

        ch=Character.toLowerCase(ch);

        if(ch>='a' && ch <='m'){
            System.out.println("Lies between a and m");
        }else{
            System.out.println("Lies between n and z");
        }
        sc.close();
    }
}