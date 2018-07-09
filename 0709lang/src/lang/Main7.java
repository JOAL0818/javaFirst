package lang;

import java.io.IOException;

public class Main7 {

	public static void main(String[] args) {
		// Hello Word를 100만번 출력하는데 걸리는 시간을 측정해서 출력
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i=i+1) {
			System.out.println("Hello java");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("작업시간:"+(end-start));

	
		//환경변수확인
		System.out.println(System.getenv("path"));
	
		//시스템속성확인
		System.out.println(System.getProperty("java.version"));
	
		//프로그램 실행
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe http://www.naver.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
