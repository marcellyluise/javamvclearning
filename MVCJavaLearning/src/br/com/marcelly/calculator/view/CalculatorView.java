package br.com.marcelly.calculator.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * The View class handle the user interface
 * The View also does not know that the Model exists
 * 
 */

public class CalculatorView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNumber = new JTextField(10);
	private JLabel addtionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	public CalculatorView(){
		// Setting up the interface that is gonna be displayed in the screen
		JPanel calcutatorPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcutatorPanel.add(firstNumber);
		calcutatorPanel.add(addtionLabel);
		calcutatorPanel.add(secondNumber);
		calcutatorPanel.add(calculateButton);
		calcutatorPanel.add(calcSolution);
		
		this.add(calcutatorPanel);
		
	}
	
	public int getFirstNumber(){
		// Convert string to Integer
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber(){
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
	}
	
	// Set the calcSolution because the Model is going to calculate this
	public void setCalcSolution(int solution){
		calcSolution.setText(Integer.toString(solution));
		
	}
	
	// Add a lister for the Controller handle it and pass to the Model to
	// make the calculation
	public void addCalculationListener(ActionListener listenForCalcButton){
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	// The View handle what is being viewed. 
	// If a user do not pass the two number is gonna trigger an error 
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
