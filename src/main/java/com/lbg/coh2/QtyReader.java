package com.lbg.coh2;

import java.io.InputStream;
import java.util.Scanner;

public class QtyReader extends UserInput {
	
	public QtyReader(IPrompt cp) {
		super(cp);
	}

	@Override
    public String readFromKeyboard(InputStream is) {
    	Scanner theScanner = new Scanner(is);
		prompt.prompt("Enter quantity: ");
    	return theScanner.nextLine();
    }
}
