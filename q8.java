/**Write a java program that takes the x – y coordinates of a point in the Cartesian plane
 and prints a message telling either an axis on which the point lies or the quadrant in
 which it is found.
*/
 import java.util.Scanner;
public class q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x co-ordinate");
        double x = sc.nextDouble();
        System.out.println("enter the y co-ordinate");
        double y = sc.nextDouble();
        if(x>0){
            if(y>0){
                System.out.println("quadrant 1 ");
            }
            else
                System.out.println("quadrant 4");
        }
        else if(x<0) {
            if (y>0){
                System.out.println("quadrant 2");
            }
            else
                System.out.println("quadrant 3");

        }
        else if (x == 0)
            System.out.println("on y - axis");
        else
            System.out.println("on x - axis");



    }
}
