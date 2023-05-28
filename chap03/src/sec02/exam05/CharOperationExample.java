package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; char변수가 산술연산에 사용되면 int타입으로 변환되서 
		//연산결과가 int 타입이 되면서 컴파일 에러 발생
	System.out.println("c1: " + c1);
	System.out.println("c2: " + c2);
	// System.out.println("c3: " + c3);
	}

}
