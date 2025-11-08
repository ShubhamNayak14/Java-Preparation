// Check if a number lies within the range [100, 999].

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();

        if(number >=100 && number<=999){
            System.out.println("The number lies in the range betweeb 100 to 999!");
        }else{
            System.out.println("Out of range!");
        }

        sc.close();
    }    
}
