package Assesment;

import java.util.Scanner;

public class Q1 {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] cart = new int[3];
	    int[] prices = {200, 250, 300};
	    int totalCost = 0;

	    System.out.println("Enter the number of T-Shirts of each type in the cart: ");
	    for (int i = 0; i < 3; i++) {
	      System.out.print("Type " + (i + 1) + ": ");
	      cart[i] = sc.nextInt();
	      totalCost += cart[i] * prices[i];
	    }

	    int totalTShirts = cart[0] + cart[1] + cart[2];
	    double discount = 0;
	    if (totalTShirts < 5) {
	      discount = 0;
	    } else if (totalTShirts >= 5 && totalTShirts <= 10) {
	      discount = 10;
	    } else {
	      discount = 20;
	    }

	    double finalAmount = totalCost - (totalCost * (discount / 100));
	    System.out.println("Final Amount: Rs." + finalAmount);
	  }
	}
