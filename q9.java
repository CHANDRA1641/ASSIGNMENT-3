import java.util.Scanner;
/**Write a program to input 3 integer number a, b, c. Find the largest number among 3.
 Also find the 2nd largest number among 3. Here is the sample output:
 Enter the value of a, b, c:10 30 50
 Largest number: 50
 2nd largest number: 30
*/
 public class q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int n1 = sc.nextInt();
        System.out.println("2.");
        int n2 = sc .nextInt();
        System.out.println("3.");
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println("the largest number is :"+n1);
            if(n2>n3)
                System.out.println("2nd largest number is :"+n2);
            else
                System.out.println("2nd largest number is :"+n3);

        } else if (n2>n3) {
            System.out.println("the larger number is :"+n2);
            if (n3>n1)
                System.out.println("2nd largest number is :"+n3);
            else
                System.out.println("2nd largest number is :"+n2);

        }
        else{
            System.out.println("the largest number is :"+n3);
            if(n2>n1)
                System.out.println("2nd largest number is :"+n2);
            else
                System.out.println("2nd largest number is :"+n1);


        }
        if(n1>=n2 && n1>=n3|| n1>=n3 && n1<=n2 ){
            System.out.println(n2+"is the second largest number ");
        }

    }
}
