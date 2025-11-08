// 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in 24-hour:");
        int hour=sc.nextInt();
        System.out.println("Enter the time in min:");
        int timeMin=sc.nextInt();
        
        if(hour>=12){

            System.out.println("Time:"+hour+":"+timeMin+" PM");
        }else{
            System.out.println("Time:"+hour+":"+timeMin+" AM");

        }

        sc.close();


    }
}
