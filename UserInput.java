import java.util.*;

public class UserInput {
    public static void main(String args[]) {

        System.out.println("Taking input from user");

        Scanner sc = new Scanner(System.in);
        // int num1, num2;
        float num1, num2;
        System.out.println("Enter number 1 : ");
        // num1 = sc.nextInt();
        num1 = sc.nextFloat();
        System.out.println(num1);
        System.out.println("Enter number 2 : ");
        // num2 = sc.nextInt();
        num2 = sc.nextFloat();
        System.out.println(num2);
        System.out.println("The sum of two numbers is : " + (num1 + num2));

        System.out.println("Enter a single word : ");

        String s = sc.next(); // will only take one word as input ,i.e gets
        // terminated when it encounters a
        // white space.
        System.out.println(s);

        System.out.println("Enter a string : ");
        sc.nextLine(); // clearing buffer
        String str = sc.nextLine(); // before doing this clear input buffer
        System.out.println(str);

        sc.close();
    }
}
