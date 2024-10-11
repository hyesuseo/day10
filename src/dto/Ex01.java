package dto;

class Test01{
	private String name ; 
	public /*반환타입 없음*/ Test01(){ //생성자: 만약 내가 만들지 않았다면 자바 내부에서 자동적으로 실행되었다가 사라짐. 초기화 용도로 쓴다.
		System.out.println("기본 생성자 실행");
	}
	
	public Test01(String name) { //생성자 2: 매개변수의 개수가 다르다면 서로 다른 생성자로 인식한다 : overload
		System.out.println(name + " : 생성자 실행");
		this.name = name;
	}
	public String getName() {
		return name;
	}

}

public class Ex01 {
	public static void main(String[] args) {
		String name = "홍길동";
		Test01 t = new Test01(name); // 해당 생성자를 호출한다는 의미: 아무 값도 없는 기본생성자를 호출하거나, 값이 있으면 그것에 맞춰서 호출!
		
		//t.setName(); setter를 호출하지 않고 객체를 만들면서 초기화.........? 무슨말인지 아직 잘 모르겠음
		System.out.println("main: " +t.getName());
		
		//조건식혹은 반복문은 Class 바깥에는 넣을 수 없다.
		//조건식이 필요한 경우에는 생성자 안에다가 조건식을 넣어준다.
		
		
	}

}
