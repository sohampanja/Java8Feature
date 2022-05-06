package com.test.main;

interface Interf {
	public void m1();
}

public class LocalVar {

	int x = 777;

	public void m2() {
		 int  y = 888;
		Interf i = () -> {
		
			
			System.out.println(x); // x=?
			System.out.println(this.x); // X=? current outer class object
			x=55;
		//	y=6; //- we cant assign y as its scope is final by default
			
			
			System.out.println(x); // x=?
			System.out.println(this.x); // X=? current outer class object
			System.out.println(y); // x=?
			
		};
	
		i.m1();
	}
//	
//	
//	public void m2() {
//		
//			int x = 888;
//			System.out.println(x); // x=?
//			System.out.println(this.x); // X=? current outer class object
//		
//		
//	}
	
	public static void main(String[] args) {

		LocalVar t = new LocalVar();
		t.m2();
	}

}