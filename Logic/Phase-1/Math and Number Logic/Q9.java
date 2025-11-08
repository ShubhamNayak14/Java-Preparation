// Take two angles of a triangle and compute the third angle.

import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the angle1:");
        int angle1=sc.nextInt();
        System.out.print("Enter the angle2:");
        int angle2=sc.nextInt();

        int angle3=180-(angle1+angle2);
        System.out.println("Third Angle: "+angle3);
        sc.close();
    }
}
