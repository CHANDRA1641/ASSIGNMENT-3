import java.util.Scanner;
/**Write a java program that randomly generates an integer between 1 and 12 and displays
 the English month name January, February… December for the number 1, 2… 12,
 accordingly.
*/
 public class haq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = (int)(Math.random()*12+1);
        String month = null;
        switch (c){
            case 1:
                month = "january";
                break;
            case  2 :
                month = "february";
                break;
            case 3 :
                month = "march";
            case 4 :
                month = "april";
                break;
            case 5 :
                month = "may";
                break;
            case 6 :
                month = "june";
                break;
            case 7 :
                month = "july";
                break;
            case 8 :
                 month = "agust";
                 break;
            case 9 :
                month = "september";
                break;
            case 10 :
                month = "october";
                break;
            case 11:
                month = "november";
                break;
            case 12 :
                month = "december";
                break;
        }
        System.out.println("month number :"+c);
        System.out.println("month is "+month);
    }
}
