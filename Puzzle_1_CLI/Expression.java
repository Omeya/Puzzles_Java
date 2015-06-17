import java.math.BigDecimal;


public class Expression {

	public void computeDouble(double num1, double num2) {
		// TODO Auto-generated method stub
		
		System.out.println("Actual issue when subtracting two double values ");
		System.out.println(num1 - num2);
	
	}
	
	public void computeBigDec(String st1, String st2 ) {
		// TODO Auto-generated method stub
		
		System.out.print("Modification in Puzzle 1: ");
		
		BigDecimal bg = new BigDecimal(st1);
		BigDecimal bg1 = new BigDecimal(st2);
		System.out.println("Issue solved using BigDecimal");
		System.out.println("BigDecimal:"+bg.subtract(bg1));
		
		
	}

}
