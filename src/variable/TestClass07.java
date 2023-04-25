package variable;

import java.util.Scanner;

public class TestClass07 {
	public void display() {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.println("이름 : " + name);
		age = age-1;
		System.out.println("만 나이 : " + age);
		/*
		 입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드세요
		 변수는 인스턴스 변수로 변경하여 사용하세요 
		*/
	}
	private int age;
	private String name;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
	}
	public void age() {
		age = age -1;
	}
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("만 나이 : " + age);
	}
}
