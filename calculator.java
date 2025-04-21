import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the operator[+,-,*,/,]: ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
       
        int result = 0;

        if (operator == '+') {
            System.out.println("The result is: " +(a+b));
        } else if (operator == '-'){
            System.out.println("The result is: " +(a-b));
        } else if (operator == '*') {
            System.out.println("The result is: " +(a*b));
        } else if (operator == '/') {
            System.out.println("The result is: " +(a/b));
        }  else {
            System.out.println("Invalid. Enter the operator");
        }
     }
}
