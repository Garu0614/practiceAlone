package sec04.exam05;

import java.util.Scanner;
//스캐너타입을 사용하겠다는 선언! 6장 내용 언급예정


public class ScannerExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
		
	}

}
