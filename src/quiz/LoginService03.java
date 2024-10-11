package quiz;

import java.util.Scanner;

public class LoginService03 {
	private LoginDTO03 dto = new LoginDTO03();{
		dto = new LoginDTO03();
	}
	int choice; 
	String idin, pwin, answer;
	Scanner sc= new Scanner(System.in);
	
	public void logincheck() { //case 1에 대한 기능
		System.out.println("===로그인 기능===");
		System.out.print("아이디: ");
		idin = sc.next();
		if(dto.getId()==null && dto.getPwd()==null){
			System.out.println("회원가입 먼저 하세요!");
		}else if (!idin.contains(dto.getId())) {
			System.out.println("존재하지 않는 id 입니다");
		}else if (idin.contains(dto.getId())) {
			System.out.print("비밀번호: ");
			pwin = sc.next();
			if (pwin.contains(dto.getPwd())) {
				System.out.println("인증 통과");
			}else if(pwin !=dto.getPwd()) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
	
	public void register() {
		System.out.println("===회원가입 기능===");
		System.out.print("가입하려는 아이디: ");
		idin = sc.next();
		
		if(dto.getId() == null) {
			dto.setId(idin);
			System.out.print("비밀번호 설정: ");
			pwin = sc.next();
			dto.setPwd(pwin);
			System.out.println("회원가입 성공");
			
		}else if(idin == dto.getId()) {
			System.out.println("이미 등록된 id 입니다.");
		}
		
	}
	
	public void memberOut() throws InterruptedException{
		System.out.println("===회원 탈퇴 기능===");
		if(dto.getId()==null || dto.getPwd()==null) {
			System.out.println("회원가입 먼저 하세요");
		}else {
			System.out.println("현재 아이디는 "+dto.getId()+"입니다");
			System.out.println("정말 탈퇴하시겠습니까?y/n");
			answer = sc.next();
			if (answer.contains("y")) {
				System.out.println("회원 삭제하는 중>>>");
				dto.setId(null);
				dto.setPwd(null);
				Thread.sleep(2000);
				System.out.println("탈퇴완료. 초기화면으로 돌아갑니다.");
				
			} else if(answer.contains("n")) {
				System.out.println("초기화면으로 돌아갑니다.");
				Thread.sleep(2000);
				
			}
		}
	}
	
	public void display() throws InterruptedException {
		
	while(true) {
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.print(">>>>>>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:// 로그인기능
				logincheck();
				
				break;
			case 2: 
				register();
				
				break;
			case 3:
				memberOut();
				
				break;
			}
		}	
	}
			
}
