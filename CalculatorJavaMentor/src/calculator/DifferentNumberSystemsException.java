package calculator;

public class DifferentNumberSystemsException extends Exception{
	
	public DifferentNumberSystemsException() {
		super("throws Exception //т.к. используются одновременно разные системы счисления");
	}
}
