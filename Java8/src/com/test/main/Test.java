package com.test.main;

@FunctionalInterface
interface A {
	void multi(int x, int y);

}

@FunctionalInterface
interface B extends A {
	//void Add(int x, int y);
	void multi(int x, int y);
}

class Demo implements B {

	@Override
	public void multi(int x, int y) {
		System.out.println("Multiplication");

	}

//	@Override
//	public void Add(int x, int y) {
//		System.out.println("Addition");
//
//	}

}

public class Test {

	public static void main(String[] args) {

		B bobj = new Demo();
		bobj.multi(1, 1);
		//bobj.Add(1, 2);

	}

}
