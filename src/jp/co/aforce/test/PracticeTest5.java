package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String args[]) {

		//練習問題1			
		Random rand = new Random();
		int fortune = rand.nextInt(10) + 1;

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}

		//練習問題2
		int number = 0;
		for (int i = 7; i < 100; i++) {
			if (i % 7 == 0) {
				number += i;
			}
		}
		System.out.println(number);
		
		//練習問題3
		
	}
}
