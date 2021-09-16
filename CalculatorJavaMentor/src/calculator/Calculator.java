package calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
	private static final ArrayList<String> rome =new ArrayList<String>(
		    Arrays.asList("X","I","II","III","IV","V","VI","VII","VIII","IX"));
	private String arabicNum (String[] s) {
		int a,b,v = 0;
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[2]);
		String value;
		switch(s[1]) {
			case ("+") :
				v=a+b;
				break;
			case ("*") :
				v=a*b;
				break;
			case ("/") :
				v=a/b;
				break;
			case ("-") :
				v=a-b;
				break;
				
		}
		value = String.valueOf(v);
		return value;
	}
	
	private String romanNum (String[] s) throws MinusNumException, NoNullException {
		int a,b,v = 0;
		a = RomanNumeral.toInt(s[0]);
		b = RomanNumeral.toInt(s[2]);
		s[0]=Integer.toString(a);
		s[2]=Integer.toString(b);
		v = Integer.parseInt(arabicNum(s));
		if(v < 0) {
		 throw new MinusNumException();
		}
		if(v == 0) {
		 throw new NoNullException();
		}
		return RomanNumber.toRoman(v);
	}
	
	private String checkLine(String[] s) throws Exception {
		if(!s[1].matches("[+,*,/,-]")){
			throw new NoMathOperationException();
		}
		if(s[0].matches("\\d*") & s[2].matches("\\d*")) {
			if(Integer.parseInt(s[0])>=1 & Integer.parseInt(s[0])<=10 
					& Integer.parseInt(s[2])>=1 & Integer.parseInt(s[2])<=10) {
			return arabicNum(s);
			}else {
			return "Число не входит в промежуток от 1 до 10";
			}
		}
		if(rome.contains(s[0]) & rome.contains(s[2])) {
			return romanNum(s);
		}
		if(rome.contains(s[0]) || rome.contains(s[2]) & 
		s[0].matches("\\d*") || s[2].matches("\\d*")) {
			throw new DifferentNumberSystemsException();
		}
		throw new NoMathOperationException();
	}
	
	public String readLine(String s) throws Exception {
		String[] array = s.split(" ");
		if(array.length!=3) {
			throw new FailFormatException();
		}
		return checkLine(array);
	}
}
