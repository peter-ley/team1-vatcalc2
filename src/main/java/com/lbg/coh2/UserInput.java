package com.lbg.coh2;

public abstract class UserInput implements IUserInput{
	
	protected IPrompt prompt;
	
	public UserInput(IPrompt cp) {
		prompt = cp;
	}
	
	public void setPrompt(IPrompt cp) {
		prompt = cp;
	}
	
}
