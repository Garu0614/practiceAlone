package sec02.exam08;

public class CompareOperationExample2 {

	public static void main(String[] args) {

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);  //v2가 int타입이라 double타입으로 바뀌어서 비교가 되는 것임.
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println((double)v5);  // v5를 더블로 강제변환 해보니 0.1보다 더 큰 수가 나왔다! 그 이유는 '부동 소수점'방식 때문이다.
		//부동 소수점이란 실수타입을 저장하는 방식 중 하나인데, 실수를 표현할 때 소수점의 위치를 고정하지 않는 것을 말한다.
		//실수를 컴퓨터상에서 근사하여 표현할 때 소수점의 위치를 고정하지않고 그 위치를 나타내는 수를 따로 적는 것으로, 
		//유효숫자를 나타내는 가수와 소수점의 위치를 풀이하는 지수로 나누어 표현한다.
		//다른말로는 떠돌이 소수점 방식이라 함. 반대의 경우 고정 소수점이라 한다. (부동소수점 정보 출처 : 위키백과)
		//결론 - 0.1과 0.1f를 비교할 때는 아래와 같은 방식으로 비교하면 안된다는 것을 기억해두자.
		System.out.println(v4 == v5); //왜 false 인지 	System.out.println((double)v5); 으로 확인해보자.

		//그러면 어떻게 비교를 하는 것이 좋을까. 다음과 같이 하면 된다.
		System.out.println((float)v4 ==v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
		//이 두 결과를 보면 true를 볼수 있다.
		
		//총 결론 - double float을 비교하지 않는 것이 좋다. 실수는 double로 통일 한다던지, float로 통일한다던지, 둘다 정수화 시켜서 비교하는 것이 좋다.
		
	}

}
