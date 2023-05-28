package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {

		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		// 10의 의미는 문자열 10자리를 만들고 -의 의미는 오른쪽 공백, 아무것도 안쓰면 왼쪽 공백이다!
		//문자열은 앞에 선언한 두 문자열을 지정했을때 쓴 차례로 적용된다!!
	}

}
