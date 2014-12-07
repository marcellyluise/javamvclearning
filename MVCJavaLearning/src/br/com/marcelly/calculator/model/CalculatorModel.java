package br.com.marcelly.calculator.model;


/*
 * The Model class simply performs the calculations (methods) and data
 * The Model does not know that the View exists.
 * 
 */

public class CalculatorModel {
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
		
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue(){
		return calculationValue;
	}

}
