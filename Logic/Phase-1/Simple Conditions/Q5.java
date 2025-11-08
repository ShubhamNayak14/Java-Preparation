// Check if a given year is a leap year

import java.util.*;

public class Q5{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100 ==0){
                if(year %400==0){
                    System.out.println(+year+" is a Leap year!");

                }
            }
        }else{
            System.out.println(+year+" is not a Leap year!");

        }
        sc.close();
    }
}