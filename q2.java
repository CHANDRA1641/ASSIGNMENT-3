import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of water you drink:");
        int ml = sc.nextInt();
        if(ml>5000)
            System.out.println("yes,Alice is following doctor's advice");
        else
            System.out.println("no,Alice is not following doctor's advice");

    }
}
