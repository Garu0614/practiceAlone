package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {	
		// 이 예제는 switch(position)에서 position 자리에 문자열이 올수 있다는 것을 보여주기 위한 예제이다.
		//원래 String타입에서 () 괄호 안의 자리엔 정수,변수만 오는데 자바7부터는 string타입의 변수도 들어올수 있게 되었다.
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}
}
