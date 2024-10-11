package etc;

import java.util.Scanner;

class AAA{
	private int num; // 10 꺼짐 , 20 켜짐
	public void setNum(int num) {  
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AAA a = new AAA(); //갖고있는 값을 유지하고 싶으면 반복문 바깥에서 객체화 시켜주어야 한다. 
		
		//a.setNum(100);
		
		while(true) {
			
			System.out.println("1.저장");
			System.out.println("2.확인");
			int i = sc.nextInt();
			if (i==1) {
				a.setNum(20);
			}else{
				System.out.println( a.getNum() );
			}
			
		}
		
		

	}

}
