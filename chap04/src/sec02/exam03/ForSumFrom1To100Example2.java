package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		//같은 결과이면서 다른 표기 방법(아래 7줄)
			int sum = 0;
			int i;
			for(i=1; i<=100; i++) {
				sum += i;			
			}
			
			System.out.println("1~" + (i-1) + "합: " + sum );
		}
	}


