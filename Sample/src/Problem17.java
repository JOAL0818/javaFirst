/* 
 * 스무고개 게임
 *컴퓨터가 하나의 어떤 숫자를 생성->사람은 그 숫자를 알아맞춰야합니다.
 *조건1 - 범위 : 1-100 에서 난수가 발생하도록 합니다.  
 *조건2 - 시도 횟수를 카운트합니다. 
 *조건3 - 큰수인지, 작은수인지를 판단하여 알려줍니다. 
 *조건4 - 맞추면 "정답입니다."출력 
 *예외처리 - try catch문 사용    
 */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Problem17 {
	static int input;
	
	//전역변수로 사용하면 다른 클래스에서 사용가능
	static int answer = (int)((Math.random()*100+1)); //math라는 클래스에서 함수사용 - problem 16에서 가져다쓴 범위가 더 넓다.
	static int count=0;

	
	public static void main(String[] args) {
		do {
		
		//사용자의 데이터(숫자) 입력부분.
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 100사이의 숫자를 입력하세요:");
		
		//예외처리를 위한 경우의 수를 미리 생각해야한다.-> 다양한 특수문자,... 을 입력해보면 된다. 아래 예시
		//java.util.InputMismatchException: 문자나 특수문자,큰값을 입력했을때 생성되는 에러메시지
		//java.util.NoSuchElementException : ctrl+z 입력하면 생성되는 에러메시지
		
		try {
		input = sc.nextInt();
		count++; //시도횟수 카운트
		}catch(InputMismatchException ime) {//클래스를 적어줘야 한다.
			//ime.printStackTrace();
			System.out.printf("반드시 숫자를 입력하세요");
			continue;
		}catch(NoSuchElementException nee) {
			System.out.printf("반드시 숫자를 입력하세요");
			continue;
		}catch(Exception e) {
			System.out.printf("알수 없는 오류가 발생하였습니다.");
		}
		
	
		if(answer>input) {
			System.out.println("더 큰 숫자를 입력해주세요");
		}else if(answer<input) {
			System.out.println("더 작은 숫자를 입력해주세요");
		}else {
			System.out.println("시도횟수"+count+"정답입니다.");
			break;
			}
		}while(true);	
	}
}
