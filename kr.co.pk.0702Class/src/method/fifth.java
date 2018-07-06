package method;

public class fifth {

	public static void main(String[] args) {
		//Hello Java를 3번 출력
		/*System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		//위처럼 연속된 경우는 유지보수를 위해서 반복문을사용
		for(int i=0;i<3;i=i+1) {
		System.out.println("Hello Java");
		}

		//Hello Java 3번출력하고 Hello C++를 1번 출력 후 다시 	Hello Java 3번출력
		//메소드로 묶으면 된다. 
		System.out.println("Hello C++");
		
		for(int i=0;i<3;i=i+1) {
			System.out.println("Hello Java");
			}
		*/
		
		//위의 해결책 - 메소드 사용
		//Task 클래스의 인스턴스 생성  : 여러번 불러야 하는 코드가 있으면 이렇게 사용한다.
		//이렇게 사용하면 코드는 간결해지지만, 실행속도는 조금 떨어진다. - 위처럼 사용하면 수정할때 번거롭다.
		Task ins = new Task();
		//메소드 호출
		ins.javaDisplay(); //메소드 호출할때는 반드시 괄호가 나와야한다. 
		
		System.out.println("Hello C++");

		//메소드 호출
		ins.javaDisplay(); 
		
		//6교시 메소드
		//new Task().tot();
		
		int result = new Task().tot(50);  //tot 괄호안에 수를 넣어줘야한다. - 수는 바꿀 수 있다.  
		System.out.println("합계:"+result);
		
		
		//로그인,회원탈퇴 메소드 불러올때
		boolean r = new Task().login("root", "1234");
		if(r==true) {
			System.out.println("로그인성공");
		}
		else{
			System.out.println("없는 아이디이거나 비밀번호가 틀렸습니다. ");
		}
		
		boolean s = new Task().deleteMember("root", "1234");
		if(s==true) {
			System.out.println("탈퇴성공");
		}
		else{
			System.out.println("탈퇴실패 ");
		}		
	}
}
