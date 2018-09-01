package com.base;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operands {

	Integer a;
	Integer b;
	
	public Operands(Integer a, Integer b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Operands() {
		super();
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Operands [a=" + a + ", b=" + b + "]";
	}
	
}
