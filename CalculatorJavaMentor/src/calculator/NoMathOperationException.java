package calculator;

public class NoMathOperationException extends Exception{
	
	public NoMathOperationException() {
		super("throws Exception //т.к. строка не является математической операцией");
	}
}
