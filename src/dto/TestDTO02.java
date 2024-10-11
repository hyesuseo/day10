package dto;
class ServiceTest02{
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
	
}
public class TestDTO02 {
	public static void main(String[] args) {
		//String name;
		//int kor, eng, sum;
		
		ServiceTest02 ser = new ServiceTest02();
		ser.setKor(100);
		ser.setEng(100);
		ser.setName("홍길동");
		ser.setSum(ser.getEng()+ser.getKor());
		
		//name = "홍길동"; kor = 100; eng =100;
		//sum = kor + eng;
		System.out.println(ser.getName());
		System.out.println(ser.getKor());
		System.out.println(ser.getEng());
		System.out.println(ser.getSum());
	
}
}
