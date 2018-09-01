package com;

public class XYZ {
	public final static int finalVar = 15;
	public static int var = 8;
	public void add(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		xyz.add("Hello", "XYZains");
		System.out.println(XYZ.var);
	}

}
  