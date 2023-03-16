package calc;

public class main_calc {
	public static void main(String[] args) {
		calculadora calc = new calculadora();
		calc.setN1(113);
		calc.setN2(50);
		double r = calc.add(calc.getN1() , calc.getN2());
		System.out.println("Resultado: " + r);
	}
}
