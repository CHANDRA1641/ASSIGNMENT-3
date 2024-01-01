import java.util.Scanner;


/**
 * Write a java program which displays an appropriate name for a person, using a
 * combination of nested ifs and compound conditions. Ask the user for a gender, first
 * name, last name and age. If the person is female and 20 or over, ask if she is married.
 * If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If
 * the female is under 20, display her first and last name. If the person is male and 20 or
 * over, display "Mr." in front of his name. Otherwise, display his first and last name. Note
 * that asking a person if they are married should only be done if they are female and 20
 * or older, which means you will have a single if and else nested inside one of your if
 * statements. Also, did you know that with an if statements (or else), the curly braces are
 * optional when there is only one statement inside?
 */
public class haq5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your gender male or female(m or f )");
        char gender = sc.nextLine().charAt(0);
        System.out.println("first name");
        String name = sc.nextLine();
        System.out.println("last name ");
        String lastname = sc.nextLine();
        System.out.println("Age:");
        int age = sc.nextInt();
        if (gender == 'm' || gender == 'M'&& age >=20){
            System.out.println("then can i call you"+"mr."+name+" "+lastname+" . ");

        } else if (gender == 'm'||gender == 'M'&& age < 20) {
            System.out.println("then can i call you"+name+ " "+lastname+".");

        } else if (gender == 'f'|| gender == 'F' && age >=20) {
            System.out.println("are you married"+name+"\" y or n ?\"");
            char married = sc.next().charAt(0);
            if (married == 'y' || married == 'Y'){
                System.out.println("then i shall call you mrs."+name+" "+lastname+".");

            }else
                System.out.println("then i shall call you ms."+name+".");


        }else
            System.out.println("then i shall call you"+name+" "+lastname+".");


    }
}
