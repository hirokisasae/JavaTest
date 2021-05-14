package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest4 {
	public static void main(String args[]) {

		//練習問題1
		//参照型はequalsメソッドで比較する。
		//理由は==では二つの文字列の格納場所を比較してしまうため。

		//練習問題2
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		//練習問題3
		String likeAnimals = "犬";

		if (Arrays.asList(animals).contains("犬")) {
			System.out.println(likeAnimals + "はリストに含まれています");
		} else {
			System.out.println(likeAnimals + "はリストに含まれていません");
		}

		//練習問題4
		String myBirthday = "8月";

		switch (myBirthday) {
		case "1月":
			System.out.println("元日、成人の日");
			break;
		case "2月":
			System.out.println("建国記念の日、天皇誕生日");
			break;
		case "3月":
			System.out.println("春分の日");
			break;
		case "4月":
			System.out.println("昭和の日");
			break;
		case "5月":
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case "6月":
			System.out.println("(なし)");
			break;
		case "7月":
			System.out.println("海の日、スポーツの日");
			break;
		case "8月":
			System.out.println("山の日");
			break;
		case "9月":
			System.out.println("敬老の日、秋分の日");
			break;
		case "10月":
			System.out.println("(なし)");
			break;
		case "11月":
			System.out.println("文化の日、勤労感謝の日");
			break;
		case "12月":
			System.out.println("(なし)");
			break;
		}
		
		//月の数は決まっているのでswitch文の方が見やすいと思ったから。
	}
}
