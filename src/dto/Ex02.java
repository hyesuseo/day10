package dto;

import java.util.ArrayList;
class Test02{
	public Test02() {} //생성자 만드는 순간 기본제공 생성자는 사라짐 : default 생성자는 무조건 만들 수 있도록, 매개변수 없는 생성자 만들어두어야한다.
	public Test02(String s) {}  //생성자 만드는 순간 기본제공 생성자는 사라짐 : 
		
	
}
public class Ex02 {
	public static void main(String[] args) {
	ArrayList arr = new ArrayList(); //이렇게 쓰는 것이 초기화 하겠다는 의미
	String s1 = new String();
	String s2 = new String ("초기화");
	
	Test02 t = new Test02("s"); //생성자를 사용하지 않을때는 이렇게 만들어 썼었다.
	
}
	
	
}
