package method;

import java.util.Scanner;

//실행 클래스 - main 메소드를 소유한 클래스
public class Main {

	public static void main(String[] args) {
		//Member 클래스의 인스턴스를 생성
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일:");
		String email = sc.nextLine();
		member1.setEmail(email);
		System.out.print("비밀번호:");
		String password = sc.nextLine();
		member1.setPassword(password);
		System.out.print("닉네임");
		String nickname = sc.nextLine();
		member1.setNickname(nickname);
		System.out.print("나이");
		int age=sc.nextInt();
		member1.setAge(age);
		
		//인스턴스 변수를 호출해서 데이터 저장 - member라는 클래스를 만들고 변수를 선언하고 member1으로 묶어준것이다.
		/*member1.email="jar0891@gmail.com";
		member1.password="1234";
		member1.nickname="중앙처리장치";
		member1.age=15;*/
		
		/*member1.setEmail("jar0891@gmail.com");  //메소드니까 =이 아니고 괄호지!!!!!!
		member1.setPassword("1234");
		member1.setNickname("중앙처리장치");
		member1.setAge(15);*/
	
		
		
		/*System.out.println("이메일:"+member1.email+"\t"
				+"비밀번호"+member1.password+"\t"
				+"닉네임"+member1.nickname+"\t"
				+"나이"+member1.age);*/
		//member2가 생기면 위 코드들을 똑같이 써야한다. -> 메소드를 만들면 간단해진다.
		//Member클래스로 가서 display를 만든다.
	   //member1.display();  // 사람이 늘어나면 member2.display();....이렇게만 하면 코드 간결화
		
		
		System.out.println(member1); //display대신 이렇게 사용하면 제대로 읽어왔는지 사용할 수있다. 
		
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));


		
		long m = Math.max(100,200); //이런식으로 필요한것을 찾아서 사용할수 있다.- 도큐먼트를 읽을 줄 알아야한다. 구글링 이전에
		System.out.println(m);  
		
		
	}

}
