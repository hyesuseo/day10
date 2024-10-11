package dto;
class ServiceTest03{
	private String name;
	private int kor, eng, sum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void display() {
		setKor(100);
		setEng(100);
		setName("홍길동");
		setSum(getEng()+getKor());
		
		
		System.out.println(getName());
		System.out.println(getKor());
		System.out.println(getEng());
		System.out.println(getSum());	
	}
	
}
public class TestDTO03 {
	public static void main(String[] args) {
		
		
		ServiceTest03 ser = new ServiceTest03();
		ser.display();
	//메인에는 최소한의 코드만 넣어둔다. 
}
}
