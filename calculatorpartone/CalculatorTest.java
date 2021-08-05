package com.wp.calculatorpartone;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.setOperandOne(10.5);
		calculator.setOperatoion("-");
		calculator.setOperandTwo(5.2);
		calculator.performOperation();
		System.out.println(calculator.getResult());
	}
}
