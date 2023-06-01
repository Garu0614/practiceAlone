package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {  
		
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);			//실행 매개값을 주지않으면 길이 0인 스트링 배열이 매개값으로 전달되어서 값의수가 부족하다는 결과가 나옴.		
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		//명령 프롬프트에서도 실습 완료
		//		C:\Users\sghlo>cd C:\Users\sghlo\Desktop\PracticeAlone\chap05\bin
		//		C:\Users\sghlo\Desktop\PracticeAlone\chap05\bin>java -p . -m chap05/sec02.exam05.MainStringArrayArgument 3 5
		//		3 + 5 = 8
		//		C:\Users\sghlo\Desktop\PracticeAlone\chap05\bin>java sec02.exam05.MaingStringArrayArgument 3 5
	}

}
