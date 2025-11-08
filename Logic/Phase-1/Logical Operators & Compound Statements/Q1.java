// Take a character and check if it is a letter, a digit, or neither

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.println("Character is letter!");
        }else if(Character.isDigit(ch)){
            System.out.println("Character is Digit");
        }else{
            System.out.println("Neither Digit nor Letter");
        }
        sc.close();
    }
    
}
