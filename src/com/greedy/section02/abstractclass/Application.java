package com.greedy.section02.abstractclass;

public class Application {

	public static void main(String[] args) {

		/* 추상클래스는 생성자는 가질 수 있지만 생성은 하지 못한다. */
//		Product product = new Product();
		
		
		Product smartPhone = new SmartPhone();
		smartPhone.printField();
		Product.staticMethod();
	
		smartPhone.abstMethod();
		
		if(smartPhone instanceof SmartPhone) {
			((SmartPhone)smartPhone).printSmartPhone();
		}
	}
}
