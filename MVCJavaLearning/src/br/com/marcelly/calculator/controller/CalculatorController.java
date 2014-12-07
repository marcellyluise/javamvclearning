package br.com.marcelly.calculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.marcelly.calculator.model.CalculatorModel;
import br.com.marcelly.calculator.view.CalculatorView;


/*
 * 
 * Handle the interactions between the Model and the View
 * */

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel){
		this.theModel = theModel;
		this.theView = theView;
		
		
		// Tell the View to execute the method when the button has been clicked 
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent anEvent){
			
			int firstNumber, secondNumber = 0;
			
			// Because we don't know if the user will put two numbers to be calculated 
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
				
			} catch (NumberFormatException e){
				
				theView.displayErrorMessage("You need to insert two numbers");
				
			}
		}	
	}
}
