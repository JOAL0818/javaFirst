/*Day14(논리연산자,else if문)
   특수문자, 숫자, 알파벳문자, 데이터, 제어문자(\n)등을 입력받아서 각문자의 개수를 출력하는 프로그램 작성
*/
import java.io.IOException;

public class Problem1 {
	public static void main(String[] args) throws IOException {
		int data=0;
		int alphabet=0;
		int digit=0;
		int control=0;
		int other=0;
		
		System.out.println("데이터를 입력하세요^^ 종료는 Ctrl+Z를 누루세요.");
		
		while((data=System.in.read())!=-1){						//ctrl+z누르면 입력이 끝나고 출력값이 나온다.
			if(data>='A'&&data<='Z'||data>='a'&&data<='z')
				alphabet++;
			else if(data>='0'&&data<='9')
				digit++;
			else if(data=='\t'||data=='\r'||data=='\n'||data==' ')
				control++;
			else
				other++;
		}
			System.out.println("알파벳 문자의 개수는="+alphabet);
			System.out.println("숫자의 개수는="+digit);
			System.out.println("제어문자의 개수는="+control);
			System.out.println("특수문자의 개수는="+other);		
	}
}
