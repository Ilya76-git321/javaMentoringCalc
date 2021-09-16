package calculator;

public class FailFormatException extends Exception{
	
	public FailFormatException() {
		super("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
	}
}
