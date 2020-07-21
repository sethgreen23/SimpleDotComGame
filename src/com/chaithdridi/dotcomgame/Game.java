package com.chaithdridi.dotcomgame;

public class Game {

	public static void main(String[] args) {
		/*
	    DotCom dot = new DotCom();
	    int[] location = {1,2,3};
	    String guess = "2";
	    String result = "Fail";
	    dot.setLocation(location);
	    String check = dot.checkYourself(guess);
	    if (check == "hit"){
	      result = "Pass";
	    }
	    System.out.println(result);
	    */
		//now lets make the program working
		
		int numOfGuess =0;
		String userGuess="",result = "";
		boolean active = true;
		DotCom dot = new DotCom();
		int random = (int) (Math.random()*5);
		int[] location = {random,random+1,random+2};
		dot.setLocation(location);
		String prompt = "enter your number :";
		InputHelper console = new InputHelper();
		while(active) {
			userGuess = console.getUserInput(prompt);
			result = dot.checkYourself(userGuess);
			if(result!=null) {
				++numOfGuess;
			}
			if(result == "kill") {
				System.out.println("You took "+numOfGuess+" guesses");
				active = false;
			}
		}
	  }

}
