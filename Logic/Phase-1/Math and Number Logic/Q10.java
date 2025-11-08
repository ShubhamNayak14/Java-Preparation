// 10. Check whether a number is a perfect square (without using the square root function)

import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();

        int low=1;
        int ans=1;
        int high=number;
        int mid=(low+high)/2;

        while(low<=high){
            if((mid*mid) <=number){
                ans=mid;
                low=low+1;
            }else{
                high=high-1;
            }
        }
        System.out.println(+mid);
        sc.close();
    }
}
