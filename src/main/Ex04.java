package main;

public class Ex04 {

	public static void main(String[] args) {
		
		int mathScore = 93;
		int engScore = 70;
		
		// 총점 계산
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		//평균 점수 계산
		int avgScore1 = totalScore / 2; //int/int
		System.out.println(avgScore1);
		
		double avgScore2 = totalScore / 2; //int/int
		System.out.println(avgScore2);

		double avgScore3 = totalScore / 2.0; //int/double
		System.out.println(avgScore3);
	}

}
