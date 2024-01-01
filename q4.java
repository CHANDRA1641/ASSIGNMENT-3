import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ypur guess number 1 to 9:");
        int guess = sc.nextInt();
        int random =(int)(Math.random()*(9-1)+1);
        System.out.println("computer guess no is"+random);
        if (random == guess)
            System.out.println("you got it right");
        else
            if (random == guess+1||random ==guess-1)
                System.out.println("almost got it");
            else
                System.out.println("you got it wrong");
    }
}
