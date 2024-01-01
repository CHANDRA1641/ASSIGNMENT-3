import java.util.Scanner;

/**Write a Java program that takes a year from user and print true if that year is a leap year
 otherwise print false. */
public class q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year :");
        int year = sc.nextInt();
        System.out.print(year+" ");
        if (year%4==0 ){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("true");
                }else
                    System.out.println("false");
            }else
                System.out.println("true");
        }else
            System.out.println("year is a leap year: false");


    }
}
