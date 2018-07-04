/*Day13(기본출력)
   입력한 문자 숫자로 출력
*/

//클래스 이름과 파일의 이름은 같습니다. IOException은 예약어이므로, 메소드이름/변수이름/클래스이름으로 사용한면 안된다.

import java.io.*;

public class IOExceptionSample {

	public static void main(String[] args) throws IOException {
		int ken;
		System.out.print("키보드 문자 입력요망:");
		ken = System.in.read();
		System.out.println("입력한 문자의 10진수" + ken);

	}

}
