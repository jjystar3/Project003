package quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		int math = 90;
		int eng = 70;
		int kor = 100;
		
		int totalScore = math + eng + kor;
		System.out.println("총합 점수: " + totalScore);
		
		float avgScore = totalScore / 3.0f;
		System.out.println("평균 점수: " + avgScore);
		
	}

}
