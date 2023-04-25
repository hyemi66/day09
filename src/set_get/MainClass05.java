package set_get;

import java.util.Scanner;

/*
 문제. 로그인 프로그램 만들기
 LoginClass
 	private id, pwd
 	각 set, getter생성 및 연산하는 기능
 MainClass
 	보여지는 기능을 만들자
 	1. 로그인
 	2. 회원가입
 	3. 종료
*/
class LoginClass {
	private String id, pwd;
	private boolean bool;
	public void setId(String id) { this.id = id; }
	public String getId() { return id; }
	
	public void setPwd(String pwd) { this.pwd = pwd; }
	public String getPwd() { return pwd; }
	
	public boolean Login(String id, String pwd) {
		if (getId().equals(id)) {
			if (getPwd().equals(pwd)) {
				this.bool = true;
			}
		} else { this.bool = false; }
		return bool;
	}
	
	public void print() {
		if (bool==true) {
			System.out.println("로그인성공");
		} else { System.out.println("로그인실패"); }
	}
	
}
public class MainClass05 {
	public static void main(String[] args) {
		LoginClass login = new LoginClass();
		String id, pwd;
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				pwd = sc.next();
				login.Login(id, pwd);
				login.print();
				System.out.println("로그인");
			}
			else if(num==2) {
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				pwd = sc.next();
				login.setId(id);
				login.setPwd(pwd);
				System.out.println("회원가입");
			}
			else if(num==3) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
