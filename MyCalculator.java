package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		ClassandMethodCalculator myCalc = new ClassandMethodCalculator();
		System.out.println("Addition :" + myCalc.add(10,20,30));
		System.out.println("Subtraction :" + myCalc.sub(15,5));
		System.out.println("Multiplication :" + myCalc.mul(14.25d,13.45d));
		System.out.println("Division :" + myCalc.div(12.5f,10.5f));

	}

}
