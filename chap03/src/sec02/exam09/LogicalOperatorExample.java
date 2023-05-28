package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; //A는 유니코드 65
		
		//if문은 조건문~4장에서 나올 예정
		if ( (charCode>=65) & (charCode<=90) )  {		// t , t = true ->대문자이군요가 출력이 된다. 그래서 실행됨.
			System.out.println("대문자 이군요");
			}
		if ( (charCode>=97) && (charCode<=90) ) {		// 첫 질문부터 f 이기 때문에 뒤의 tf를 확인하지 않고 결과가 실행되지 않음. 
			System.out.println("소문자 이군요");				// 왜? &&는 피연산자가 모두 t여야 연산결과가 true로 나오니까.
			}
		if ( !(charCode<48) && !(charCode>57) ) {		//!(not)이 붙었기 때문에 t, f   -> f이기 때문에 실행되지 않음
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {				//|는 앞이 t여도 뒤의 것도 검사함. 그래서 결과가 실행됨.
			System.out.println("2 또는 3의 배수 이군요");
		}
		if ( (value%2==0) || (value%3==0) ) {			// ||는 앞에가 t면 뒤에건 안보고 t로 실행 함. 그래서 결과가 실행됨.
			System.out.println("2 또는 3의 배수 이군요");
		}
		
	}

}