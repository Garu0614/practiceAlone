package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		// intValue = longValue;  // 롱타입이 더 큰 범위이기때문.
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		// intValue = doubleValue;  //정수보다는 실수가 더 큰 허용범위를 가지기 때문.
		intValue = (int) doubleValue;
		System.out.println(intValue);

		
	
		
	}

}
