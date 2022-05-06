package com.lamda.functional;

import java.util.Arrays;
import java.util.List;

import com.lamda.functional.ThreadImp;

public class ThreadDemo {
	public static void main(String[] args) {

//			ThreadImp obj = new ThreadImp();
//			Thread r = new Thread(obj);
//			r.start();

		// Thread example
		new Thread(() -> { // Lambda Expression
			for (int i = 1; i <= 5; i++) {
				System.out.println(" Thread: " + i);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();

		Runnable obj = () -> { // lambda expression
			System.out.println("Runnable with Lambda Expression");
			int arr[] = { 1, 2, 3, 4, 5, 7, 10 }; // Integer array declare

			List<Integer> nums = Arrays.asList(13, 24, 34, 44, 55);
			nums.forEach(n -> System.out.println(n));

//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(" Array Val : " + arr[i]);
//				try {
//		               Thread.sleep(5000);
//		            } catch(Exception e) {
//		               e.printStackTrace();
//		            }
//				
//			}

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			Arrays.stream(arr).forEach(a -> System.out.println("Integer Array Val : " + a));

		};
		new Thread(obj).start();

	}
}