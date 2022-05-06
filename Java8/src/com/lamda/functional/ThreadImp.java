package com.lamda.functional;

public class ThreadImp implements Runnable {

	@Override
	public void run() {
		int arr[] = { 1, 2, 3, 4, 5, 7, 10 };
		for (int i =0;i<arr.length; i++) {
			System.out.println("Value : " + arr[i]);
		}

	}

}
