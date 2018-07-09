
//1-45까지 중복되지 않는 6개의 정수 저장
package lang;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		//1-45까지 정수를 6개 저장할 공간을 생성
		int [] lotto = new int [6];
		//배열의 데이터 개수를 정할 변수
		int size = lotto.length;
		//반복문에 넣어 사용하는것을 보통 '인덱스 변수'라고 한다.
		int i,j;
		
		//1)배열의 기본복습 - 배열에 있는 모든 데이터를 출력해본다.  
		for(i=0;i<size;i=i+1) {
			System.out.println(lotto[i]);
		}
		
		
		//2)1-45까지 중복되지 않는 6개의 정수 저장
		//데이터를 입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//배열의 전체데이터 순회
		for(i=0;i<size;i=i+1) {
			try {
				System.out.println("1-45사이의 정수입력");
				String temp = sc.nextLine();
				lotto[i]=Integer.parseInt(temp);
				
				//숫자범위가 1-45가 아닐경우, 다시 입력받아야한다. - 두가지 방식으로 표현가능
				//if(lotto[i]<1||lotto[i]>45){        
				if(!(lotto[i]>=1 && lotto[i]<=45)) {  
					System.out.println("1-45사의 정수가 아닙니다.");
					i=i-1;
					continue;		  
				}					
				
				//이전에 입력된 값들과 비교 - 중복검사
				for(j=0;j<=i-1;j=j) {
					//이전 데이터와 방금 입력받은 데이터가 같으면 반복문을 종료한다.
					if(lotto[i]==lotto[j]) {
						break;
					}											
				}
				//이전 데이터와 방금입력된 데이터가 동일하면 
				if(j!=i) {   //j=i가 같지 않다는 건 끝까지 다돈게 아니다.
					System.out.println("동일한 데이터는 안됩니다.");
					i=i-1;
					continue;
				}				
			}
			
			catch(Exception e){
				System.out.println("정수를입력하세요");
				i=i-1;		//정수를 입력하지 않았을 때 무효화 시키는 작업 : 이렇게 해야 정상적으로 6개를 받을 수 있다.
				 			//밑에 별다른 내용이 없기때문에 contitue;를 사용하지 않아도 된다.
			}	
			
		}		
		sc.close();    //스캐너를 제대로 닫아줘야 경고가 없다.				
	}
}
