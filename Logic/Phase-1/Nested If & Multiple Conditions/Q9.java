// Take a day number (1—7) and print the corresponding day name.

import java.util.*;
public class Q9{
    public static void main(String[] Arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Day in number:");
        int day=sc.nextInt();

        switch(day){
            case 1:System.out.println("Monday");
                    break;
            case 2:System.out.println("Tuesday");
                    break;
            case 3:System.out.println("Wednesday");
                    break; 
            case 4:System.out.println("Thursday");
                    break;
            case 5:System.out.println("Friday");
                    break; 
            case 6:System.out.println("Saturday");
                    break;
            case 7:System.out.println("Sunday");
                    break;        
            default:
                System.out.println("Enter number is day of range. please given input in range between 1-7");        
        }
        sc.close();
    }
}