package com.lbg.coh2;

import java.io.InputStream;
import java.util.Scanner;

public class PCodeReader extends UserInput{
	
	public PCodeReader(IPrompt prompt) {
		super(prompt);
	}

	@Override
    public String readFromKeyboard(InputStream is) {
    	Scanner theScanner = new Scanner(is);
		prompt.prompt("Enter a product code: ");
    	return theScanner.nextLine();
    }
}
