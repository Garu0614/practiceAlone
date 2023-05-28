package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		//주사위 눈이 6이나오면 프로그램을 종료하게 만드는 프로그램.
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num ==6) {		//만약 num이 6이되면
				break;			//break해라   라는 뜻
			}
		}
		System.out.println("프로그램 종료");
	}

}
