package com.lbg.coh2;

import java.io.InputStream;
import java.util.Scanner;

public class QtyReader {

    public String readFromKeyboard(InputStream is) {
    	Scanner theScanner = new Scanner(is);
		System.out.print("Enter quantity: ");
    	return theScanner.nextLine();
    }
}
