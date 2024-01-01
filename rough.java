import com.sun.source.tree.SwitchTree;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class rough
{
    /**public static void main(String args[])
    {
        System.out.println("ram ram ");
        Scanner sc = new Scanner(System.in);
        int opt1, opt2,result, choice;
        do
        {
            System.out.println("enter two integer operands");

            opt1 = sc.nextInt();
            opt2 = sc.nextInt();
            System.out.println("menu");
            System.out.println("1.Addition\n 2.subtraction \n 3.multiplication \n 4.divison ");
            System.out.println("enter operands between 1 and 5 :");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    result = opt1 +opt2;
                    System.out.println(result);
                case 2 :
                    result = opt1-opt2 ;
                    System.out.println(result);
                case 3 :
                    result = opt1*opt2 ;
                    System.out.println(result);
                case 4:
                    result = opt1/opt2 ;
                    System.out.println(result);
                default:
                    System.out.println("invalid operator\n to exit enter 5");
            }



        }while (choice!=5);

    }*/    // calculator
    /**public static void main(String args[]){
        int a =11111,b=6,c=0;
        int d = a>b && a>c ? a: ((b>c)?b:c);
        System.out.println(d);

    }  */ // greatest of three no. by single line command.
    public static void main(String args[]){
        int a = 6 ,b =3;
        System.out.println(a & b);

        System.out.println( a | b );

    }
}