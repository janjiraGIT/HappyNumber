package com.janjira.HappyNumber;

import org.junit.Test;

import com.janjira.happynumber.NumberValidation;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;

public class HappyNumberTest {
	
	private NumberValidation numberValidation = new NumberValidation();
	private final static Logger logger = Logger.getLogger(HappyNumberTest.class);
	private final static int[] HAPPYLIST = { 1, 7, 10, 13, 19, 23, 28, 31, 32, 44 };
	private final static int[] SADLIST = { 2, 8, 11, 15, 20, 24, 29, 30, 35, 43 };
	int number = 0;
	
	@After
	public void runAfterTest() {
		logger.info("Finish the test!");
	}

	@Test
	public void happyTest() {
		org.apache.log4j.BasicConfigurator.configure();
		for (int i = 0; i < 10; i++) {
			int number = numberValidation.validateHappyNumber(HAPPYLIST[i]);
			Assert.assertEquals(1, number);
			logger.info(number);
		}
	}

	@Test
	public void sadTest() {
		for (int i = 0; i < 10; i++) {
			int number = numberValidation.validateHappyNumber(SADLIST[i]);
			Assert.assertNotEquals(1, number);
			logger.info(number);
		}
	}
}
