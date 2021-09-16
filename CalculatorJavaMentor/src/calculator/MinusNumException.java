package calculator;

public class MinusNumException extends Exception{
	
	public MinusNumException() {
		super("throws Exception //т.к. в римской системе нет отрицательных чисел");
	}
}
