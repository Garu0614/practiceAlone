package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {

		//실수값 저장		
		//float var1 = 3.14;  f안쓰면 컴파일 에러
		float var2 = 3.14f;   
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);

		//정밀도 테스트
		float var4 = 0.1234567890123456789f;      //19자리
		double var5 = 0.1234567890123456789;
		
		System.out.println(var4);     //반올림 된 7자리까지만 저장됨
		System.out.println(var5);     //반올림 된 17자리만 저장됨 (약 15자리)
		
		
		//e사용하기
		//	int var6 = 3e6;  컴파일 에러
		double var6 = 3e6;  
		float var7 = 3e6f;
		double var8 = 2e-3;
						
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);



	}

}
