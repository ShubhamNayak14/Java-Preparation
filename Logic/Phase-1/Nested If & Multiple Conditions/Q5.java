// Take the hour of the day (0—23) and print "Good Morning", "Good Afternoon", "Good
// Evening", or "Good Night"


import java.util.*;
public class Q5{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a hour(24 hour clock):");
        int hour=sc.nextInt();

        if(hour>=6 && hour<=12){
            System.out.println("Good Morning");
        }else if(hour>=12 && hour<=17){
            System.out.println("Good afternoon");
        }else if(hour>=17 && hour<=20){
            System.out.println("Good Evening");
        }else{
            System.out.println("Good Night");
        }
        sc.close();
    }
}