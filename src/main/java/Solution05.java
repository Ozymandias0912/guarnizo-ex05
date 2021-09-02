/*
 *  UCF COP3330 Fall 2021 Assignment 1 exercise05 Solution05
 *  Copyright 2021 Juan Guarnizo
 */

/*
* Pseudocode
*
* Create Scanner input variable.

* Create String variables number1 and number2.
* Create int variables num1 and num2.
*
* Print message: "What is the first number?".
* number 1 = user's input.
*
* Print message: "What is the second number?".
* number2 = user's input.
*
* num1 = integer version of number1.
* num2 = integer version of number2.
*
* Create double variables: sum, diff, product, quotient.
*
* sum = num1 + num2.
* diff = num1 - num2;
* product = num1*num2;
*
* if num2 is different from 0,
* then quotient = num1 / num2,
* otherwise quotient = 0.
*
* if num2 is different from 0,
*
*      if(num2 != 0)
*       Print message: "num1 + num2 = sum
*       num1 - num2 = diff
*       num1 * num2 = product
*       num1 / num2 = quotient".
*       else
*       Print message:
*       "num1 + num2 = sum
*       num1 - num2 = diff
*       num1 * num2 = product
*       It is not possible to divide by zero.
*/
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String number1, number2;
        int num1, num2;

        System.out.println("What is the first number?");
        number1 = input.nextLine();

        System.out.println("What is the second number?");
        number2 = input.nextLine();

        num1 = parseInt(number1);
        num2 = parseInt(number2);

        double sum, diff, product, quotient;
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1*num2;
        if(num2 != 0)
            quotient = num1 / num2;
        else quotient = 0;

        if(num2 != 0)
        System.out.printf("%d + %d = %.0f\n%d - %d = %.0f\n%d * %d = %.0f\n%d / %d = %.0f",
                num1, num2, sum, num1, num2, diff, num1, num2, product, num1, num2, quotient);
        else
            System.out.printf("%d + %d = %.0f\n%d - %d = %.0f\n%d * %d = %.0f\nIt is not possible to divide by 0",
                    num1, num2, sum, num1, num2, diff, num1, num2, product);


    }
}
