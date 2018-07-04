/* 입력된 문자가 대문자이면 소문자로 변경하는 프로그램을 작성하세요.
 
 */
import java.io.IOException;
public class Problem12 {

	public static void main(String[] args) throws IOException {		
		int ch=0;
		
		ch = System.in.read();

		if(ch>='A'&&ch<='Z') {			//Scanner보다도 read를 더 많이 사용한다.-모든걸 다 스캐너로 하려고 하지마라
			ch=ch+32; // 입력한 문자로부터의 거리를 ASCII에서 hint를 얻는다.
			System.out.println((char)(ch)); //char를 사용하지 않으면 
		}	
		else if(ch>'a'&&ch<='z') {
			ch=ch-32;
			System.out.println((char)(ch));				
		}			
	}
}


