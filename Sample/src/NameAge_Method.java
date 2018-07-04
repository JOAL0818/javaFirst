import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAge_Method {
	// 필드영역(전역변수영역)
	private String name; // 전역변수로 바꿔줘서 여기에 있어도 된다. - 자바에서는 멤버변수라고 한다.
	private int nae; // '클래스의 멤버변수'

	// 함수의 선언과 정의를 한꺼번에 했다.
	private String name_method() throws IOException { // '멤버함수'(c++과 개념이 같다.) // void라는 의미는 리턴값 x의미 그래서 return name을 적어줘도 빨간줄
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("이름을 입력하세요:");
		name = input.readLine(); // 예외처리 해줘야 한다. throws~ ,  

		return name;
	}

	private int age_method() throws NumberFormatException, IOException{ // 예외처리 두가지가 생긴다.-제시된걸로 사용하면된다.
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 함수간 다른공간이므로 name과 다르게 여기에도 이 문장이
																						// 들어가야한다.

		System.out.println("나이를 입력하세요:");
		int age = Integer.parseInt(input.readLine());
		int nae = age + 100;

		return nae;
	}

	private void display_method() { 
		System.out.println(name + "의 나이는" + nae + "세 입니다."); // 지역변수로 사용하면 이 괄호 안에서만 처리되므로, 전역변수로 처리해야된다.
	}

	// 함수호출
	public static void main(String[] args) throws IOException { 
		NameAge_Method agm = new NameAge_Method(); // 함수이름 '함수'약자agm'임의로 적어줌 = 클래스파일이 필요
		agm.name_method(); // 정의가 되어있지 않으면 빨간줄이 그어진다. - creat method눌러주면 된다.
		agm.age_method();	//호출부
		agm.display_method();
	}

}