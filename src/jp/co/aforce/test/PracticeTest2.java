package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;

		//練習問題1
		System.out.println(x * y);

		//練習問題2
		System.out.println(y / x);
		System.out.println(y % x);

		//練習問題3
		double number = y * z;
		System.out.println(number);

		//練習問題4
		number++;
		System.out.println(number);

		//練習問題5
		int age = 22;
		Random rand = new Random();
		int r = rand.nextInt(100) + 1;

		if (age > r) {
			System.out.println("私の方が年上です");
		} else if (age < r) {
			System.out.println("私の方が年下です");
		} else if (age == r) {
			System.out.println("私と同い年です");
		}

		System.out.println("r=" + r);

	}

}
