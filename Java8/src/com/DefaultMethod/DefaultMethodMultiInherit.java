package com.DefaultMethod;

interface A1 {

	default void m1()
	{
		System.out.println("A1 under default");
		}

}

interface B1 {

	default void m1()
	{
		System.out.println("B1 under default");
	}	

}

class DefaultMethodMultiInherit implements A1, B1 {

	
	public static void main(String[] args) {
		
	
		DefaultMethodMultiInherit obj = new DefaultMethodMultiInherit();
		obj.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		B1.super.m1();
	}


//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		A1.super.m1();
//	}

}