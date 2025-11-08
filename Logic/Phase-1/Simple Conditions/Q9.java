// Take a character and check if it’s a vowel or consonant.

import java.util.*;
public class Q9{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if(ch>='a' && ch <='z'){
            if(ch=='a'|| ch=='o'||ch=='i'||ch=='e'||ch=='u'){
                System.out.println("Vowel!");
            }else{
                System.out.println("Consonant!");
            }
        }else{

        System.out.println("Not a character");
        }
        sc.close();
    }
}