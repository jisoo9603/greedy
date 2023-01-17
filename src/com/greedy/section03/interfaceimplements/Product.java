package com.greedy.section03.interfaceimplements;

public class Product extends java.lang.Object implements InterProduct, SmartPhone{

	@Override
	public void nonStaticMethod() {
		System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출됨...");
	}

	@Override
	public void abstMethod() {
		System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출됨...");
	}
	
	/* default 키워드를 제외하면 defaultMethod도 오버라이딩 할 수 있다. */
	@Override
	public void defaultMethod() {
		System.out.println("Product 클래스의 defaultMethod 호출됨...");
	}
	
	/* static 메소드는 오버라이딩을 할 수 없다. */ 
//	@Override
//	public static void staticMethod() {}
}
