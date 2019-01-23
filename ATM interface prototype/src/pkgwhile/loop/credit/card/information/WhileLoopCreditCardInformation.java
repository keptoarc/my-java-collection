/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.loop.credit.card.information;

import java.util.Scanner;

/**
 *
 * @author Wakemeup
 */
public class WhileLoopCreditCardInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        boolean running = true;
        int pin;
        double ammount;
        double bankbalance = 6000;
        System.out.println("Welcome to Bank bank");
        System.out.println("please enter your PIN");
       
        pin = r.nextInt();
        if (pin == 1495) {
            while (running) {
                System.out.println("Welcome to bank bank Please select a Menu, Menu 1 is for Transfers, 2 for withdrawls, 3 for your balance and 4 for to cancle at any time. ");
                int menu = r.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("enter the account id");
                        
                        break;
                    case 3:
                        System.out.println(" your current balance is " + bankbalance + "$");
                        break;
                    case 2:
                        System.out.println("Withdraw");
                        System.out.println("Please enter the ammount you wish to withdraw");
                        ammount = r.nextDouble();
                        System.out.println("your current balance is " + (bankbalance - ammount));
                        System.out.println("Thank you for Using Bank Bank please take your cash");
                        break;
                    case 4:
                        running = false;
                        break;
                }
            }
        } else {
            System.out.println("invalid PIN please try again");
        }

    }
}

//System.out.println("Please enter the ammount you wish to withdraw ammount");
//ammount = r.nextDouble();
                    //System.out.println("Thank you for Using Exault bank please take your cash");
