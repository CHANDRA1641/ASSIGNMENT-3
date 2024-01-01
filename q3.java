/**Write a program that reads three integers from the user and prints "Increasing" if the
 numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
 and "Neither increasing nor decreasing order" otherwise.*/
import java.util.Scanner;
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = sc.nextInt();
        System.out.println("enter the second number");
        int n2 = sc.nextInt();
        System.out.println("enter the third number");
        int n3 = sc.nextInt();
        if(n1>n2  & n2>n3)
            System.out.println("decreasing");
        else{
            if(n1<n2 & n2<n3)
                System.out.println("increasing");
            else
                System.out.println("neither increasing nor decreasing");
        }
    }
}
