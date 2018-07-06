//클래스생성 / Person이라는 객체(인스턴스)생성 / 1.지역변수

//person이라는 클래스 생성 : 이름만 정하면 클래스 만드는 건 쉽다.
/*class Person{
	
}
public class Main {

	public static void main(String[] args) {
		//Person이라는 클래스의 인스턴스(객체)를 생성
		Person ins = new Person();
		//인스턴스 이름을 가지고 출력하면 toStrting()이라는 메소드의 결과가 호출된다.
		//*잘 만들어졌는지 확인하려면 계속 찍어봐야한다. - 소스가 길어질때
		//*출력결과 : 보통은 클래스 이름과 해시코드가 출력된다. 예)'Person@139a55'/ 실패하면 null이 출력되던지 예외가 발생하던지 한다.
		System.out.println(ins);
		
		//*Hello Java를 3번 출력하는 작업   
		for(int i=0;i<3;i=i+1) {   //*알고리즘에서는 보통 ++사용하지 않는다.
			System.out.println("Hello Java");  //*i는 for 밖에서는 쓸수 없다. : 지역변수
		}
		//*System.out.println(i); - i는 for라는 제어문 안에서 만들었기 때문에 바깥에서는 사용불가
		
		//*지역변수는 반드시 초기화해서 사용해야한다.  
		//예) int k;
		//System.out.println(k); 이렇게 하면 초기화 안돼있어서 에러가 난다. "The local variable k may not have been initialized"			
	}
}*/


// 2.멤버변수 / 3.정적변수
//person이라는 클래스 생성 : 이름만 정하면 클래스 만드는 건 쉽다.

class Person{
	//+클래스 안에 static 없이 만들어진 변수를 instance 변수라고 한다.
	//+이 변수들은 객체가 만들어질 때 각 객체마다 별도로 메모리를 할당받습니다. - 객체를 두개만들어 보면 확인할 수 있다.(맨 아래 예시존재)
	int num;//+번호를 저장하기 위한 변수
	String name;//+이름을 저장하기 위한 변수
	String phone;//+전화번호를 저장하기 위한 변수

    //^static 변수 - 공유, 반드시 static이라고 써줘야한다.
	static String schoolName; //^글자가 기울어진다.
	
	//@TEN이라는 변수는 10을 저장, 변경할 수 없습니다.
	static int x =10;
	static final int TEN=x; //static final int TEN=10;
	//@TEN의 값을 x로 지정하면 TEN은 x값으로 고정되지만, x는 수정할 수 있다.
	//@읽기는 두곳 이상에서 가능하지만, 쓰기는 동시에 불가능하다  예)은행시스템: 인터넷뱅킹,ATM 둘다 동시에 불가
}

public class Main {

	public static void main(String[] args) {
	
		//Person.TEN=20;  //@위에서 TEN=10이라고 했기때문에 빨간줄에러가 뜬다.
		
		//+위 phone 변수 선언하면서 나온질문  why long이 아니고 string으로 선언할까??
		//long phonenumber = 010981589818L //+long이면 맨앞에 0인식x, 부분검색하기 힘들다 

		//+인스턴트 2개생성
		Person person1= new Person();
		Person person2= new Person();
		//각 인스턴스의 num의 값을 출력
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);
		//person1의 num을 1로 변경 - person 1만 기존의 값과 달라지면 별도의 메모리를 할당받는 다는것 
		person1.num=1;
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);

		
		//^static은 하나만 만들어서 공유하기 때문에 누군가가 변경하면 다른 모두에 영향을 미칩니다. - 여러명이 사용하는건 static으로 만들면 메모리도 아낄 수 있고 좋다. 예)고창석-쉐어하우스
		person1.schoolName="만재국민학교";   
		//^Person.schoolName="만재국민학교"; 이렇게 클래스 명으로 해도 된다.-경고 노란줄 없다. 
		//^instance로 부르면 왼편과 같이 경고표시 노란줄 : why?  
		System.out.println("person1:"+person1.schoolName); //^person 1,2의 변화값이 똑같이 나온다. 
		System.out.println("person2:"+person2.schoolName); 		
	}

}




