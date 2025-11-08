// 3. Take marks (0—100) and print the corresponding grade (AIB/C/D/F).

import java.util.*;
public class Q3{
    public static void main(String[] Arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of a student:");
        int mark=sc.nextInt();

        if(mark<=100 && mark>=90){
            System.out.println("E Grade");
        }else if(mark<=90 && mark>80){
            System.out.println("A Grade");
        }else if(mark<=80 && mark>70){
            System.out.println("B Grade");
        }else if(mark<=70 && mark>60){
            System.out.println("C Grade");
        }else if(mark<=60 && mark>50){
            System.out.println("D Grade");
        }else if(mark<=50 && mark>40){
            System.out.println("F Grade");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }
}