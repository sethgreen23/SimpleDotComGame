package com.chaithdridi.dotcomgame;
import java.io.*;

public class InputHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(
			new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0 ) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e.toString());
		}
		return inputLine;
	}
}