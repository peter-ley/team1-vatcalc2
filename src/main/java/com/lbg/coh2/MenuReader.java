package com.lbg.coh2;

import java.io.InputStream;
import java.util.Scanner;

public class MenuReader{
	
    public String readFromKeyboard(InputStream is) {
    	Scanner theScanner = new Scanner(is);
    	System.out.print("Main Menu\nOptn. 1\tView inventory\nOptn. 2\tAdd item to basket\nOptn. 3\tCheckout\nEnter Option Number: ");
    	return theScanner.nextLine();
    }
}
