package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intvalue: " + intValue);
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("longvalue: " + longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatvalue: " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doublevalue: " + doubleValue);

	}

}
