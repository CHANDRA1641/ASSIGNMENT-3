import java.util.Scanner;
public class q1 {
    public static void main(String args[]){
        System.out.println("ram ram");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();
        if(age>19)
            System.out.println("you are eligible to caste vote");
    }
}
