package calculator;

import java.util.Scanner;

public class CalculatorStart {
	
	private static Calculator calc = new Calculator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
		System.out.println("Введите два числа и действие, которое хотите с ними сделать"
				+ " через пробел");
		String s = in.nextLine();
		try {
			s = calc.readLine(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println(s);
		} finally {
			in.close();
		}
	}

}
