import java.util.Scanner;
/**Write a java program to calculate the monthly electricity bill. The tariff is given as
 follows:
 Price per unit Unit range
 Rs. 3/- First 50 units
 Rs. 4.80/- 50-200 units
 Rs. 5.80/- 200-400 units
 Rs. 6.20/- Above 400 unit
 */
public class q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  electrical unit use this month");
        int unit = sc.nextInt();
        double bill;
        if(unit<=50){
            bill=unit*3;
            System.out.println("you have to pay rupees "+bill);

        }else if(unit<=200){
            bill = unit*3+(unit-50)*4.80;
            System.out.println("you have to pay rupees "+bill);
        } else if (unit<=400) {
            bill = unit *3 + unit *4.80+(unit-50-200)*5.80;
            System.out.println("you have to pay rupees "+bill);
        }else{
            bill = unit *3 +unit*4.80+unit*5.80+(unit-50-200-400)*6.20;
            System.out.println("you have to pay rupees "+bill);
        }

    }
}
