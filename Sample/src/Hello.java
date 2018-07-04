/*(기본출력) 
  안녕하세요,반갑습니다.../i=10,j=50일 때 더한 값 출력)
*/

//한줄 주석
//java.lang.*; ->이 폴더에 가장 많은 함수들을 제공한다.   * : 와일드카드(어떤것을 쓸지 알수없기에 이걸사용한다.)

import java.lang.System;  //import 가져다 쓴다는 의미 

public class Hello {
//사이트화면 : field summary : 필드라고 되어있지만 다른부분에서도 사용가능하다.
//이부분이 필드영역이다. - 이걸 다른파일에서 사용하려면 public이라는 말이들어가야한다.
	public static void main(String[] args) {
		//public final class System extends Object : 
		
		System.out.printf("Hello World");	
		System.out.printf("안녕하세요");
		System.out.printf("반갑습니다.");
		
		int hap;
		int i=10, j=50;
		 hap=i+j;	//초기화 시키라는 메시지가 뜰것이다. - 초기화 시켜주면 없어진다.
		System.out.printf("결과는=%d", hap);  //hap이라고 했을때, 선언이 되어있지 않아 오류가 뜨고 첫번째것 선택하면 자동선언된다.	 ,대신 +사용한다. +는 연결연산자라고 해서 합을 나타낸다.						
		System.out.println("결과는="+ hap);
		/*여러줄 주석
		System: system이라는 클래스가 있어야 작동한다.
		out : 객체 
		printf: 출력하라는 의미를 가진 메소드(method)
		("hello world") : 문자열"" => string 클래스 : 자바에서는 character도쓰고 string도 쓴다. 
		; : 문장의 끝을 나타낸다.
		*/
		//위의 것들은 api에 다 정의되어있다.
	
	}
}//열고 닫는 개수는 반드시 같아야한다. 