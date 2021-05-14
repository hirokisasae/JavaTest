package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeTest3 {

	public static void main(String[] args) {

		//練習問題1
		String[] person = { "1", "田中太郎", "男性", "27" };

		//練習問題2
		System.out.println(person[1]);

		//練習問題4
		Employee tanaka = new Employee(1, "田中太郎", "男性", 27);
		Employee satou = new Employee(2, "佐藤花子", "女性", 22);
		Employee suzuki = new Employee(3, "鈴木次郎", "男性", 31);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(tanaka);
		employees.add(satou);
		employees.add(suzuki);

		for (Employee employee : employees) {
			employee.profile();
		}

		//練習問題5
		HashMap<String, String> scores = new HashMap<>();
		scores.put("国語", "90");
		scores.put("数学", "80");
		scores.put("英語", "65");

		for (String key : scores.keySet()) {
			String value = scores.get(key);
			System.out.println(key + " : " + scores.get(key));

		}
		//練習問題6
		//HashMapを使った理由は科目と点数が紐づけられるから。
	}

}
