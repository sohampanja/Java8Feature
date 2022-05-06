package com.java8.lamdaExp;

import java.util.*;
import com.functional.Allinterface.*;

  //Functional Interface
	@FunctionalInterface
	interface Addition {
	    void answer(int x, int y); // Abstract function
	}
	
	
public class LamdaWithParam {
	
/*	public static int sum (int x , int y , int z) {
		int result=x+y+z;
		return result;
	}
	*/
	
	public static void main(String[] args) {
		
		Addition obj = (int x, int y) -> System.out.println(x + y);
        obj.answer(65, 25);
        
        Multiplication mulobj= (int x, int y)-> System.out.println(x * y);
        mulobj.multi(4,9);
        
//		 int a,b,c;
//		 a=5;
//		 b=7;
//		 c=9;
//        System.out.println("The sum is =" + sum(a, b, c));

	}
	
}
