package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {   //i가 1부터 시작해서, 10이하일때까지 돌아라, 그래서 반복할때 1씩 증가해라
			if(i%2 !=0) {			//i를 2로 나눈 나머지가 0이냐 아니냐~? (홀수냐~?)
				continue;			//홀수면 컨티뉴 해라~ 
			}
			System.out.println(i);
		}
	}
}
