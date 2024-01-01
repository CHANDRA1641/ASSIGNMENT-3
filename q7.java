import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class q7 {
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
        System.out.println("do you want to pay online(y/n)");
        char choice = sc.next().charAt(0);
        switch (choice){
            case 'y' :
            case 'Y':
            {
                double discount = bill * 3/100 ;
                double new_bill = bill - discount ;
                System.out.println("your discount is Rs"+discount);
                System.out.println("you have to pay "+new_bill);
                break;


            }
            case 'n':
            case 'N':
                System.out.println("you have to pay Rs:"+bill);
        }
    }
}
