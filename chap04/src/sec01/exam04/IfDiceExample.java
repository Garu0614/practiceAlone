package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		System.out.println(Math.random());
		//Math.random()메소드는 0.0과 1.0 사이에 속하는 수를 랜덤하게 나오게 함
		System.out.println(Math.random()*6);
		//*6을 했을때 -> 0.0<= ~ <6.0 에 속하는 수를 랜덤하게 나오게 함
		
		//정수로 바꾸기 위해서는
		System.out.println((int)(Math.random()*6));
		//6미만의 수가 랜덤하게 정수로 나오게 된다.
		
		//주사위 눈을 나오게 하자고 가정하고 정수이자 주사위 눈에 해당하는 숫자들을 나오게 하기 위해서는
		System.out.println((int)(Math.random()*6) + 1);
		
		System.out.println("-------------------");

		int num = (int)(Math.random()*6) + 1;
		
		if (num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
