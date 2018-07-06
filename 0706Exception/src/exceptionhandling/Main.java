package exceptionhandling;

public class Main {

	public static void main(String[] args) {
		
		//문제가 일어날 가능성이 있는 친구들을 try로 묶어준다. -> 예외처리해당부분을 제외하고 실행을 시켜준다.
		//(이것이 예외처리의 목적 : 중간에 문제가 생겨도 계속 실행할수 있도록)
		try {			
		int i=10;
		int j=0;
		int result=i/j;
		System.out.println("결과:"+result);
		}
		catch(Exception e) {
			
		}
		System.out.println("예외발생 후 실행");
		
	}
}
