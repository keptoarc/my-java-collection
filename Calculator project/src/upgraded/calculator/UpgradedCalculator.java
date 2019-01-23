/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upgraded.calculator;

import java.util.Scanner;

/**
 *
 * @author Wakemeup
 */
public class UpgradedCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        System.out.println("enter number");
        double number1 = r.nextDouble();
        r.nextLine();
        String symbole = r.nextLine();
        double number2 = r.nextDouble();

        switch (symbole) {
            case "+":
                System.out.println(number1 + "+" + number2 + " is equal to " + (number1 + number2));
                break;
            case "-":
                System.out.println(number1 + "-" + number2 + " is equal to " + (number1 - number2));
                break;
            case "*":
                System.out.println(number1 + "*" + number2 + " is equal to " + (number1 * number2));
                break;
            case "/":
                System.out.println(number1 + "/" + number2 + " is equal to " + (number1 / number2));
                break;

        }
    }

}
