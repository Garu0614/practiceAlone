package sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //같으냐~?
		boolean result2 = (num1 != num2); //다르냐~?
		boolean result3 = (num1 <= num2); //크냐 같으냐~?
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A'; 
		char char2 = 'B';
		boolean result4 = (char1 < char2); //적으냐?? 으잉 문자인디? // char타입은 숫자(정수)타입이기때문에 A,B의 유니코드로 비교! A는 65 B는 66
		System.out.println("result4=" + result4);
		
	}

}
