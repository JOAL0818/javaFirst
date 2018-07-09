package lang;

public class Main6 {

	public static void main(String[] args) {
		//*****Enter
		//for(int i=0;i<5;i=i+1) {  //굳이 0부터 할필요없다. 5번으로 하는 것만 하면 된다. 
		for(int i=1;i<=5;i=i+1) {
			System.out.print("*");			
		}
		
		System.out.println("");
		System.out.println("");
		
		//***** 5줄 출력
		for(int i=1;i<=5;i=i+1) {
			for(int j=1; j<=5;j=j+1) {   //i변수로 사용해도 된다.
				System.out.print("*");
			}
			System.out.println("");
		}
		
				
		//*로 직각삼각형 출력 
		//행을 i로 열을 j로 해라  -> 1행 1-1 2행 1-2.... 5행 1-5 : 시작과 끝의 간격만 알면된다. 
		for(int i=1;i<=5;i=i+1) {
			for(int j=1; j<=i;j=j+1) {   //i변수로 사용해도 된다.
				System.out.print("*");
			}
			System.out.println("");
		}

		
		//*로 직각삼각형 출력 
		//행을 i로 열을 j로 해라  -> 1행 1-1 2행 1-2.... 5행 1-5
		for(int i=1;i<=5;i=i+1) {
			for(int j=1; j<=2*i-1;j=j+1) {   //i변수로 사용해도 된다.
				System.out.print("*");
			}
			System.out.println("");
		}

		
		//뒤집어진 직각삼각형
		for(int i=1;i<=5;i=i+1) {
			for(int j=1; j<=6-i;j=j+1) {   //i변수로 사용해도 된다.
				System.out.print("*");
			}
			System.out.println("");
		}		

		
		//반잘린 다이아몬드 형태 : 늘어났다가 줄어든다. - 분활과 정복을 이용해서해결(나눠서 해결 - if사용해서)
		for(int i=1;i<=5;i=i+1) {
			if(i<=3) {
				for(int j=1; j<=i;j=j+1) {  
					System.out.print("*");
				}
			}
			else {				
				for(int j=1;j<=6-i;j=j+1) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
				
	}

}
