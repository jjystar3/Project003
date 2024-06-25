package quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		int age = 26;
		
		boolean result1 = (age <= 40);
		boolean result2 = (age == 40);
		boolean result3 = (age != 40);
		
		System.out.println("나이가 40세보다 적거나 같나요?: " + result1);
		System.out.println("나이가 40세인가요?: " + result2);
		System.out.println("나이가 40세가 아닌가요?: " + result3);
		
	}

}
