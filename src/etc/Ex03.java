package etc;

public class Ex03 {
	public static void main(String[] args) {
		
		for(int i = 0 ; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("시작");
		long start = System.currentTimeMillis();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();	
		System.out.println("종료");
		System.out.println( (end-start)/1000 ); //나누기 천을 해야 우리가보는 초단위까지 나옴
			 
		
}
}
