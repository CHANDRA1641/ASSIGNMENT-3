import java.util.Random;
import java.util.Scanner;

/**Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
 a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
 randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
 program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
 whether the user or the computer wins, loses, or draws.
 Here are sample runs:
 scissor (0), rock (1), paper (2): 1
 The computer is scissor. You are rock. You won
 scissor (0), rock (1), paper (2): 2
 The computer is paper. You are paper too. It is a draw
*/
 public class haq1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.");
        System.out.println("scissor(0),rock(1),paper(2):");
        int n = sc.nextInt();
        System.out.print("the computer is :");
         int cputurn = (int)(Math.random()*3);
         switch (cputurn){
             case 0 :
                 System.out.println("Scissor");
                 break;
             case 1 :
                 System.out.println("rock");
                 break;
             case 2 :
                 System.out.println("paper");
                 break;
         }
        System.out.print("you are :");
        switch (n){
            case 0 :
                System.out.println("Scissor");
                break;
            case 1 :
                System.out.println("rock");
                break;
            case 2 :
                System.out.println("paper");
                break;
        }
        if(cputurn==n){
            System.out.println("It is draw .");
        }
        else {
            boolean win = (n==0&&cputurn==2)||
                    (n==1&&cputurn==0)||(n==2&&cputurn==1);
            if (win){
                System.out.println("you won");
            }
            else
                System.out.println("you lose");

        }




    }
}
