package quiz02;

import java.util.Scanner;
//case 별로 만들고나서 case를 떼어서 생각하자
public class MemberService {
	MemberDTO dtoo = new MemberDTO();
	int choice, kin, ein, min, ssum;
	String namein;
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 보기");
		System.out.println("3. 정보 수정");
		System.out.println("4. 회원 탈퇴");
		System.out.print(">>>>>>>");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			enroll();
			
			break;
		
		case 2: // 학생보기
			stucheck();
			break;
		case 3: // 정보수정
			modify();
			
			break;
		case 4: //회원탈퇴 - 모든 값을 null과 0으로 초기화
			del();
			
			break;
		}
		}
		}
	public void enroll() { //case 1
		
		System.out.println("---학생등록---");
		System.out.print("이름: ");
		namein = "김김김";
		namein = sc.next();
		if(dtoo.getName() == null){
			dtoo.setName(namein); 
			System.out.print("국어점수: ");
				kin= sc.nextInt();
				dtoo.setKor(kin);
			System.out.print("영어점수: ");
				ein = sc.nextInt();
				dtoo.setEng(ein);
			System.out.print("수학점수: ");
				min = sc.nextInt();
				dtoo.setMath(min);
				ssum = kin + ein + min;
				dtoo.setSum(ssum);
			System.out.println("합: "+dtoo.getSum());	
			gradeView(dtoo.getSum());
			System.out.println("등급: "+dtoo.getGrade()); 
		}else if (namein.contains(dtoo.getName())) {
			System.out.println("이미 등록된 이름입니다");}	
	}
	
	public void stucheck() { //case 2
		System.out.println("---학생보기---");
		if (dtoo.getName()==null) {
			System.out.println("먼저 회원가입하세요");
		}else {
		System.out.println("이름 :" + dtoo.getName());
		System.out.println("------------");
		System.out.println("국어 :" + dtoo.getKor());
		System.out.println("영어 :" + dtoo.getEng());
		System.out.println("수학 :" + dtoo.getMath());
		System.out.println("합계 :" + dtoo.getSum());
		System.out.println("등급 :" + gradeView(dtoo.getSum()));
		}
	}
	
	public void modify() { //case 3
		System.out.println("---정보수정---");
		if(dtoo.getName() == null) {
			System.out.println("등록된 정보가 없습니다.");
		} else {
		System.out.println("1. 이름수정");
		System.out.println("2. 국어점수 수정");
		System.out.println("3. 영어점수 수정");
		System.out.println("4. 수학점수 수정");
		System.out.print(">>>>>>>>>>>");
		choice = sc.nextInt();
		
		if (choice ==1) {
			System.out.print("새 이름 입력: ");
			namein = sc.next();
			dtoo.setName(namein);
		}
		else if (choice ==2) {
			System.out.print("새 국어점수 입력: ");
			kin = sc.nextInt();
			dtoo.setKor(kin);
		}else if (choice ==3) {
			System.out.print("새 영어점수 입력: ");
			ein = sc.nextInt();
			dtoo.setEng(ein);
		}else if (choice ==4) {
			System.out.print("새 수학점수 입력: ");
			min = sc.nextInt();
			dtoo.setMath(min);
		}
		System.out.println("수정된 정보는 아래와 같습니다.");
		System.out.println("이름 :" + dtoo.getName());
		System.out.println("------------");
		System.out.println("국어 :" + dtoo.getKor());
		System.out.println("영어 :" + dtoo.getEng());
		System.out.println("수학 :" + dtoo.getMath());
		dtoo.setSum(dtoo.getEng()+dtoo.getKor()+dtoo.getMath());
		System.out.println("합계 :" + dtoo.getSum());
		gradeView(dtoo.getSum());
		System.out.println("등급 :" + dtoo.getGrade());
		}
	}
	
	public void del () { //case 4
		
		String answer;
		System.out.println("---회원탈퇴---");
		if(dtoo.getName()==null) {
			System.out.println("먼저 회원가입하세요");
		}else {
		System.out.println("정말 탈퇴하시겠습니까? y/n");
		System.out.print(">>>>>>>");
		answer = sc.next();
		if (answer.contains("y")) {
			dtoo.setName(null);
			dtoo.setKor(0);
			dtoo.setEng(0);
			dtoo.setMath(0);
			dtoo.setSum(0);
			System.out.println("회원정보 삭제 완료");
			System.out.println("초기화면으로 돌아갑니다.");
			}
		}
	}
	
	public String gradeView (int a) {
		String grade="a";
		if ( a/3 ==100 ) {
			grade = "S";
		}else if (a/3>=90) {
			grade = "A";
		}else if (a/3>=80) {
			grade = "B";
		}else if (a/3>=70) {
			grade = "C";
		}else if (a/3>=60) {
			grade = "D";
		}else if (a/3<60) {
			grade = "F";
		}
		dtoo.setGrade(grade);
		return grade;
	}
		
	
	}

