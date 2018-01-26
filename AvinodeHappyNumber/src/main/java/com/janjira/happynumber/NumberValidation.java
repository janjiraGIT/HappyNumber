package com.janjira.happynumber;

import java.util.ArrayList;
import java.util.HashSet;

import org.apache.log4j.Logger;


public class NumberValidation {
	final static Logger logger = Logger.getLogger(NumberValidation.class);
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
		logger.info("The Happy numbers are " + happyList.size() + " numbers =>" + happyList);
		logger.info("The Sad numbers are " + sadList.size() + " numbers =>" + sadList);
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
