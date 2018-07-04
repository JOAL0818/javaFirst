/* 이름과 나이를 입력, 그대로 출력하는 프로그램을 작성하세요.
   예시) 입력: 홍길동 300   출력: 홍길동님의 나이는 300세입니다.
*/


//내코드
/*import java.util.Scanner;
public class Problem8 {
	public static void main(String[] args) {
		int age;
		String name;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요->");
		
		name=scn.next();
		age=scn.nextInt();
		
		System.out.print(name+" 의 나이는 "+age+" 입니다.");
	}
}*/

//선생님코드
import java.io.*;
public class Problem8{
	public static void main(String[] args) throws IOException {
		 BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("이름을 입력하세요:");
		 String name=input.readLine();	
		 			
		 System.out.println("나이를 입력하세요:");
		 int age = Integer.parseInt(input.readLine());
		 int nae = age+100;
		 
		 System.out.println(name+"의 나이는"+nae+"세 입니다.");
	}
}
	//이부분이 String name 아래로 들어간다.
	 /*try {								//이부분은 개발자가 입력, 실행되면서 문제발생할 여지가 있는 소스를 여기에 기록
			 
		 } 
		 catch(ArithmeticException e) {	
			 e.printStackTrace();
		 }
		 catch(IOException e) {			//IOException 이클래스가 작동하며 예외처리 
			 e.printStackTrace();	    //try 절에서 문제가 발생하면 catch절에서 잡을 것이다. - catch절은 여러절이 올수 있다.
		 }						        //처리는 큰거에서 작은것으로 Exception -> IOE -> Arithmetic~ : 딱 정해진건 없지만, 강사님 경험상 
		 catch(Exception e) {	
			 e.printStackTrace();
		 }*/


/* 형 전환 
  public class ChangeString{
  	public static void main(String[]args){
  		//기본 데이터 형 선언
  		 int a - 10;
  		 System.out.println(a+10);
  		 
  		//String형으로 변환
  		 String sa1 = String.valueOf(a);    //팔싱에 비교하면 다소느리다. 각각 성능차이가 조금씩 난다.
  		 System.out.println(sa1+10);
  		
  		//Wrapper Class 객체 생성
  		 Integer oint = new Integer(10);
  		 
  		//String형으로 변환
  		 String sa2 = oint.toString();
  		 System.out.println(sa2+10);
 
//String형을 int형으로 변환
//		 int k= Integer.parseInt(sa2); 
 	}
 }
 */











