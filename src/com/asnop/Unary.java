package com.asnop;

public class Unary {

	public static void main(String[] args) {
		int y=10,x=20;
		int result= +x;
		System.out.println("+x= "+ result);
		result=-y;
		System.out.println("-y= "+ result);
		result= ++x;
		System.out.println("++x= "+result);
		result=--y;
		System.out.println("--y= "+ result);
		boolean ok=false;
		System.out.println(ok);
		System.out.println(!ok);

	}

}
