package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		int x = 10; // 11
		
		int y = 20; // 19
		
		int result = (x++) + (--y); // 10 + 19 = 29

		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
	}

}
