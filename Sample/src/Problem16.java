/*가위,바위,보 게임을 합니다.
 * 조건: 난수를 발생하여 처리합니다.
 * Random()메소드 사용
 * 사용법:Random()메소드에서 객체를 생성하여 사용합니다.
 */
import java.util.Scanner;
import java.util.Random;
public class Problem16 {
	public static void main(String[]args) {
		//computer=rd.nextInt(3) -> 0~2까지의 숫자를 생성
		//computer=rd.nextInt(3) + 1; -> 1~3까지의 숫자를 생성.(보통 로또에서 이 방법을 이용)
		
		Random rd = new Random();
		int computer=rd.nextInt(3)+1;
		System.out.println("가위:1, 바위:2, 보:3, 게임종료:4 을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int user= sc.nextInt();
		
		//가위를 입력한 경우
		if(user==1) {	
			switch(computer) {
			case 1: System.out.println("무승"); break;
			case 2: System.out.println("패"); break;
			case 3: System.out.println("승"); break;
			}
		}
		//바위를 입력한 경우
		if(user==2) {
			switch(computer) {
			case 1: System.out.println("승"); break;
			case 2: System.out.println("무승부"); break;
			case 3: System.out.println("패"); break;
			}
		}	
		//보를 입력한 경우
		if(user==3) {
			switch(computer) {
			case 1: System.out.println("패"); break;
			case 2: System.out.println("승"); break;
			case 3: System.out.println("무승부"); break;	
			}
		}
		else if(user==4) {
			System.out.println("게임을 종료합니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}				
	}
}
