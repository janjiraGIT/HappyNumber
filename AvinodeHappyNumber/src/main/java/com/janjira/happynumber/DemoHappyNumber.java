package com.janjira.happynumber;


public class DemoHappyNumber {

	public static void main(String[] args) {
		org.apache.log4j.BasicConfigurator.configure();
		NumberValidation NumberValidation = new NumberValidation();
		NumberValidation.validateNumbers();
	}
}
