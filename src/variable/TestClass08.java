package variable;

import java.util.Scanner;

public class TestClass08 {
	private int a, b, c, sum=0, av=0;
	private String name, s;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		a = sc.nextInt();
		System.out.print("영어 점수 : ");
		b = sc.nextInt();
		System.out.print("수학 점수 : ");
		c = sc.nextInt();
	}
	public void sum() {
		sum = a + b + c;
	}
	public void av() {
		av = sum / 3;
	}
	public void s() {
		if(av>=90) { s = "A"; }
		else if(av>=80) { s = "B"; }
		else { s = "C"; }
	}
	public void print() {
		input();
		sum();
		av();
		s();
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + a + "점");
		System.out.println("영어 점수 : " + b + "점");
		System.out.println("수학 점수 : " + c + "점");
		System.out.println("합 : " + sum + "점");
		System.out.println("평균 : " + av + "점");
		System.out.println("등급 : " + s + "등급");
	}
}
