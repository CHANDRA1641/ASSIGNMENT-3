import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
/**Write a java program that prompts the user to enter an integer for today’s day of the
 week (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter
 the number of days after today for a future day and display the future day of the week.
 Here is a sample run:
 Enter today's day: 1
 Enter the number of days elapsed since today: 3
 Today is Monday and the future day is Thursday
 Enter today's day: 0 Enter the number of days elapsed
 since today: 31
 Today is Sunday and the future day is Wednesday*/
public class haq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(Sunday is 0, Monday is 1… and Saturday is 6)");
        System.out.println("enter today's day:");
        int tody = sc.nextInt();
        int td = tody%7;
        System.out.println("enter the number of days elapsed:");
        int elap = sc.nextInt();
        String c = null;
        switch (td) {
            case 0:
                c = "sunday";
                break;
            case 1:
                c = "monday";
                break;
            case 2:
                c = "tuesday";
                break;
            case 3:
                c = "wednesday";
                break;
            case 4:
                c = "thrusday";
                break;
            case 5:
                c = "friday";
                break;
            case 6:
                c = "saturday";
                break;
        }
        int fday = elap + tody;
        int s = fday%7;
        String  m = null ;
        switch (s){
            case 0 :
            m = ("sunday");
            break;
            case 1 :
                m = "monday";
                break;
            case 2 :
                m = "tuesday";
                break;
            case 3 :
                m = "wednesday";
                break;
            case 4 :
                m = "thrusday";
                break;
            case 5 :
                m = "friday";
                break;
            case 6 :
                m =  "saturday";
                break;

        }
        System.out.println("today is "+c+" and the future day is "+m);

    }
}
