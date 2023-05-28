package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {

		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		//산술 연산식에서 피연산자가 하나라도 롱이면 전체 연산의 결과는 롱으로 나온다!! 
		
	}

}
