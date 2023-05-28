package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		//8<= ... < 12(8+4) 사이의 정수 얻기
		int time = (int)(Math.random()*4) + 8;			
		//Math.random()는 0.0에서 1.0 사이의 실수, *4를 하니까 0.0에서 4.0 사이의 실수(4.0은 포함이 안됨!)
		//이 결과값에서 int로 바꾸게 되면 0,1, 2, 3이 될 것임.
		//거기다 +8을 하면 8, 9, 10, 11을 얻을 것이다.
				
		System.out.println("[현재시간: " + time + " 시]");
		
		 switch(time ) {
		 	case 8:
		 		System.out.println("출근합니다.");		//break가 없으면 그 다음것들을 다 실행하는 특징을 가지고 있다.
		 	case 9:
		 		System.out.println("회의를 합니다.");
		 	case 10:
		 		System.out.println("업무를 봅니다.");
		 	default:
		 		System.out.println("외근을 나갑니다.");
		 		
		 }
	}

}
