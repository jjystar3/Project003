package quiz;

public class Quiz09 {

	public static void main(String[] args) {
		
		char ch = (5 > 3) ? '오' : '삼';
		System.out.println(ch);
		
		int x = 10;
		int y = 20;
		int result = (x>10) ? y+10: y-10; //x가 10보다 크면 y에 10을 더하고, x가 10보다 작거나 같으면 y에 10을 뺀 값을 result 변수에 삽입해라.
		System.out.println(result); // x는 10보다 크지 않기 때문에 y에 10을 뺀 값이 출력된다.
	}

}
