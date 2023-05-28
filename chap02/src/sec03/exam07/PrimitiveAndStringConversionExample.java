package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		String str1 = "10";
		int value1 = Integer.parseInt(str1);  //str1자리에 parseInt("10") 이라 해도 같은 결과가 나옴!
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		
		//숫자를 문자열로 변환시켜보기 ->
		//int value4 = 10으로 선언한 다음에 
		//String str1 = String.valueOf에 (value4);로 선언하면 아래 사례들과 같은 결과값이 나올 수 있음!
		//같은결과 다른 예 ->
		String str11 = String.valueOf(10);   //str1이 중복이름으로 인식되서 11로 내가 임의 수정함!
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str11);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		

	}

}
