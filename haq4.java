import java.util.Scanner;
/**Write a java program that prompts the user to enter an integer and determines whether
 it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
 by 5 or 6, but not both.
 Here is a sample run of this program:
 Enter an integer: 10
 Is 10 divisible by 5 and 6? false
 Is 10 divisible by 5 or 6? true
 Is 10 divisible by 5 or 6, but not both? True*/
public class haq4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Is divisible by 5 and 6 ? "+((n%5==0)&&(n%6==0)));
        System.out.println(" Is divisible by 5 or 6 ? "+((n%5==0)||(n%6==0)));
        System.out.println(" Is divisible by 5 or 6 ,but not both ? "+((n%5==0)^(n%6==0)));
    }
}
