package abstractTest;

public class Main {

	public static void main(String[] args) {
		Smartphone smartPhone = new Iphone();
		smartPhone.call();
		
		smartPhone = new Android();
		smartPhone.call();
		
		//Smartphone은 인스턴스를 안만들어도 되는데 만들 수 있다. -> Smartphone 클래스에 abstract 붙이면 에러가난다.
		//smartPhone = new Smartphone();
		
		smartPhone = new WinPhone();
		smartPhone.call();
		
		
		//final 변수 - 값을 변경할 수 없습니다.
		//지역변수지만, 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		//ZERO =1;  이런식으로 값을 변경할 수 없다. - 에러가 뜬다.
		//이렇게 읽기 전용으로 만드는 이유 : 1)          2)프로그램을 알아보기 쉽게
		
		
		
		/* 1)과 2)을 비교해보면, 2)이 더 보기 좋다는 것을 알 수 있다. -> 단순히 1)처럼 1이라고 쓰는 것보다는 2)처럼 해주는게 더 쉽다.
		//1)
		int command = 1;
		switch(command) {
		case1;
		case2;
		}
		//2)
		int command =1;
		final int LBUTTONDOWN=1;
		final int RBUTTONDOWN=2;
		if(command==LBUTTONDOWN) {			
		}
		else if(command==RBUTTONDOWN) {	
		}
		*/
		
		
		
		//기초문법연습
		//실수를 정수로 강제 형 변환 : 소수가 버려집니다.
		double x =10.7;
		System.out.println("x:" + (int)x);
		//소수 첫째자리 반올림 -> 확장하면 둘째자리 반올림도 가능
		double a =10.7;
		System.out.println("x:" + (int)(x+0.5));
		
		

	}

}
