// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions

import java.util.*;
public class Q8{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Temperature:");
        int Temperature=sc.nextInt();

        if(Temperature<=5){
            System.out.println("Cold!");
        }else if(Temperature>=5 && Temperature<=25){
            System.out.println("Warm");
        }else{
            System.out.println("Hot!!");
        }
        sc.close();
    }
}