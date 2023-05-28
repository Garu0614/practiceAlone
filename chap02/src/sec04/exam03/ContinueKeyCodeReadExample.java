package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception{

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			//종료하려면 결과 콘솔 값 창 위에 X표시 옆에있는 강제 종료 버튼을 눌러야 함!
			
		}
	}

}
