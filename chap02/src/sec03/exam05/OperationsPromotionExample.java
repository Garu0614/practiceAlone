package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 + = byteValue1 + byteValue2; 컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;    //char 타입 은 유니코드 저장, a = 65 로 저장, 
		//정수연산의 결과는 정수지만 char타입은 int로 받기 때문에 결과를 char타입으로 받으면 안된다!
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		//문자로 출력하고 싶을땐? ->
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; 			 //      10 / 4 ==>2.5
		System.out.println(intValue4); 			//2로만 결과 나옴.
		double doubleValue = intValue3 / 4.0;   //실수 나누기 실수가 되서 결과가 실수로 나옴! 
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);



	}

}