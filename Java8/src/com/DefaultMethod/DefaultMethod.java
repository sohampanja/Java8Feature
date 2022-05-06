package com.DefaultMethod;

interface A {

	void m3();

	default void m1() {
		System.out.println("under Default method");
	}

	default void m2() {
		System.out.println("under Default m2");
	}
}

interface B {

	

	default void m1() {
		System.out.println("under Default method");
	}
//
//	default void m2() {
//		System.out.println("under Default m2");
//	}
}


public class DefaultMethod implements A {
	
	@Override
	public void m3() {
		System.out.println("under implementation method m3");

	}

	public static void main(String[] args) {

		DefaultMethod obj = new DefaultMethod();
		obj.m1();
		obj.m2();

//		A pob = new DefaultMethod();
//		pob.m3();
		obj.m3();
		System.out.println(obj.hashCode());
	}

	
}
