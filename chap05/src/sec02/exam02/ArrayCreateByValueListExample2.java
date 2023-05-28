package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] { 83, 90, 87 }; 
		//저번 예제와의 차이점은 바로 여기까지의 두줄!! 
		//배열변수 선언 후 그 뒤에 값의 목록을 줄 경우 new 연산자와 함께 
		//변수타입과 동일한 배열타입을 주고 객체를 형성해야한다는 것.
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
}


