package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int [2][3];
		
		mathScores[1][2] = 10;  // 전부 int타입배열이기 때문에 기본값이 0인데, 만약 1행 2열에 값 10을 넣고싶다면~! 이렇게 추가!
		
		for (int i=0; i<2; i++) {
			for(int k=0; k<3; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]="
						+mathScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i=0; i<2; i++) {
			for(int k=0; k<englishScores[i].length; k++) {  // k<3을 주게되면 'ArrayIndexOutOfBoundsException'이라는 예외가 발생.
				//배열에서 인덱스를 잘못 사용하면 이러한 예외가 발생한다. 인덱스에 2가 없다고 표기되는데 계단식에서 주의할 점은
				//바깥 for문은 행수만큼 반복해서 문제x. 안쪽 ,for문에서 문제가 발생. 안쪽 for문이 2번밖에 안돌고 조건은 3번도는 것이기 때문.
				//해결하기위해선 위와같이 수정(englishScores[i].length : 이 의미는 해당 행에서 참조하는 배열의 길이만큼만 참조한다는 의미이다.
				System.out.println("englishScores[" + i + "][" + k + "]="
						+englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		//int[][] javaScores = { {}, {} }; : 이 의미는, javaScores라는 변수는 2차원 배열을 참조한다 그리고 행수는 2개이다.(열수는 아직 결정안된것)
		//int[][] javaScores = { {95, 80 }, {92, 96, 85} }; : 이렇게 값의 수를 틀리게 줄 경우엔 행열구조로 생성되는 것이 아닌 계단식으로 생성이 된다.
		//(윗줄에 이어서 설명)행수는 2개지만 들어가는 값의 수가 다르기 때문에 2열 3열로 만들어지는데 이렇게 값의 구조로도 행렬구조 또는 계단식 구조로 만들 수 있다.
		for (int i=0; i<2; i++) {
			for(int k=0; k<javaScores[i].length; k++) { 
				System.out.println("javaScores[" + i + "][" + k + "]="
						+javaScores[i][k]);
			}
		}
		
		
	}

}