package com.janjira.happynumber;

import java.util.ArrayList;
import java.util.HashSet;


public class NumberValidation {
	
	private ArrayList<Integer> happyList = new ArrayList<Integer>();
	private ArrayList<Integer> sadList = new ArrayList<Integer>();


	public void validateNumbers() {
		for (int i = 1; i <= 1000; i++) {
			if (validateHappyNumber(i) == 1) {
				happyList = addHappyNumberInList(i);
			}else {
				sadList = addSadNumberInList(i);	
			}
		}
		System.out.println("The Happy number are " + happyList.size() + " numbers =>" + happyList);
		System.out.println("The Unhappy number are " + sadList.size() + " numbers =>" + sadList);
	}

	private ArrayList<Integer> addSadNumberInList(int i) {
		sadList.add(i);
		return sadList;
	}

	private ArrayList<Integer> addHappyNumberInList(int i) {
		happyList.add(i);
		return happyList;
	}

	public int validateHappyNumber(int number) {
		HashSet<Integer> setOfNumbers = new HashSet<Integer>();
		while (!setOfNumbers.contains(number)) {
			setOfNumbers.add(number);
			number = produceSumSquareDigit(number);
		}
		return number;
	}

	public static int produceSumSquareDigit(int number) {
		int squareSum = 0;
		while (number > 0) {
			int digit = (number % 10);
			int square= digit * digit;
			squareSum += square ;
			number = number / 10;
		}
		return squareSum;
	}
}
