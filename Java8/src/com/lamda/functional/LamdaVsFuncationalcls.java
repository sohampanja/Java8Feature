package com.lamda.functional;

interface Intr {
	public void sum(int a, int b);
}

class Demo implements Intr {
	@Override
	public void sum(int a, int b) {
		System.out.println("sum " + (a + b));
	}
}

public class LamdaVsFuncationalcls {

	public static void main(String[] args) {
		
//		Demo ob=new Demo();
//		ob.sum(2, 6);
		
		 Intr it = new Demo();
		 it.sum(1, 1);
		
		//Add function by Lamda Exp  - no implementation require
		Intr i = (a, b) -> System.out.println("The Result is : " + (a + b));
		i.sum(7, 8);

	}

}
