package jp.co.aforce.test;

public class Employee {

	//練習問題3

	private int number;
	private String name;
	private String gender;
	private int age;

	public Employee(int number, String name, String gender, int age) {
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getNumber() {
		return this.number;
	}

	public String getName() {
		return this.name;
	}

	public String getGenger() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

	void profile() {
		System.out.println("番号は" + this.number + "、名前は" + this.name + "、性別は" + this.gender + "、年齢は" + this.age);
	}

}
