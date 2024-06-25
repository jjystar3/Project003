package main;

public class Ex02 {

	public static void main(String[] args) {
		
		//디버그 단축키
		//F6 : 한줄씩 실행
		//F8 : 다음 브레이크 포인트까지 스킵
		
//		int x = 100;
//		int y = x++;
//		int z = x--;
//		
//		System.out.println(x); //100
//		System.out.println(y); //100
//		System.out.println(z); //101
		
		int x = 100;
		int y = ++x;
		int z = --x;

		System.out.println(x); //100
		System.out.println(y); //101
		System.out.println(z); //100
		
	}

}
