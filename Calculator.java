
/**
 * 
 * Created by Antonio Martinez
 * pyramid- Java School
 * 
 */

import java.util.Formatter;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please, write two numbers to be calculated: ");

        number1 = input.nextDouble();
        number2 = input.nextDouble();

        System.out.println("Please, write the operator: [+, -, *, /]");

        char operator = input.next().charAt(0);
        double operation = 0;

        switch (operator) {

            case '+':
                operation = number1 + number2;
                break;

            case '-':
                operation = number1 - number2;
                break;

            case '*':
                operation = number1 * number2;
                break;

            case '/':
                operation = number1 / number2;
                break;

            default:
                System.out.println("Not valid operator.");
        }

       //Format 2 decimals
       Formatter formatter = new Formatter();
       formatter.format("%.2f", operation);


        System.out.println("Result:");
        System.out.println();

        System.out.println(number1 + " " + operator + " " + number2
                + " = " + formatter.toString());
    }
}
