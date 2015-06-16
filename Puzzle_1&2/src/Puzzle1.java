import java.math.BigDecimal;

//Day 1 (Puzzle 1 and 2)
public class Puzzle1 {
//This method works for condition 1 but it fails to work for negative value of i
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This method works. For negative(odd) value of "i" it does not return true.
		int i=-3;
		System.out.println(isOdd(i)+" "+((i%2)));
double num1 = 2.0;
double num2 = 1.1;
double total = (num1-num2);

BigDecimal bg = new BigDecimal("2.0");
BigDecimal bg1 = new BigDecimal("1.1");
System.out.println("BigDecimal:"+bg.subtract(bg1));
System.out.println("Float:"+total);
}
	
	public static boolean isOdd(int i){
	//return (i&1) !=0;//condition 2
		return ((i%2)!=0);//condition 1
	}
	

}
