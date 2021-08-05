package com.wp.calculatorpartone;

import java.io.Serializable;

public class Calculator implements Serializable {

	private double operandOne;
	private double operandTwo;
	private String operator;
	private double result;
	
	public Calculator() {
	}
	
	public double getOperandOne() {
		return this.operandOne;
	}
	
	public void setOperandOne(double num) {
		this.operandOne = num;
	}
	
	public double getOperandTwo() {
		return this.operandTwo;
	}

	public void setOperandTwo(double num) {
		this.operandTwo = num;		
	}
	
	public String getOperation() {
		return this.operator;
	}

	public void setOperatoion(String op) {
		this.operator = op;
	}
	public void performOperation() {
		if (this.getOperation() == "+") {
			this.result = this.getOperandOne() + this.getOperandTwo();
		} else if (this.getOperation() == "-") {
			this.result = this.getOperandOne() - this.getOperandTwo();			
		} else {
			this.result = 0;
		}
		
	}

	public double getResult() {
		return result;
	}

}
