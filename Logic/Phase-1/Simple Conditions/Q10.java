// Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.

import java.util.*;
public class Q10{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);

        if(Character.isLowerCase(ch)){
            System.out.println("LowerCase");
        }else if(Character.isUpperCase(ch)){
            System.out.println("UpperCase");
        }else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}