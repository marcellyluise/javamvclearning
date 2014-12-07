import br.com.marcelly.calculator.controller.CalculatorController;
import br.com.marcelly.calculator.model.CalculatorModel;
import br.com.marcelly.calculator.view.CalculatorView;


public class MVCJavaLearning {
	
	public static void main(String[] args){
		
		CalculatorView theView = new CalculatorView();
		
		CalculatorModel theModel = new CalculatorModel();
		
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
		
	}

}
