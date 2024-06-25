package quiz;

public class Quiz06 {

	public static void main(String[] args) {
		
		int value1 = 7 % 2; //나머지 구하기
		int value2 = 10 % 2; //나머지 구하기

		boolean result1 = (value1 == 1); //홀수인지 확인
		boolean result2 = (value2 == 0); //짝수인지 확인
		
		System.out.println("7은 홀수인가요?: " + result1);
		System.out.println("10은 짝수인가요?: " + result2);
		
	}

}
