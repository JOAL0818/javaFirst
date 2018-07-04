/* 점수를 입력받아서 학점을 구하고, 학점이 A이면 전액 장학금대상이고,
 * 학점이 B이면 반액 장학금대상이고,
 * 학점이 C이면 근로 장학금대상이고,
 * 아니면, 장학금 대상이 아닙니다. 출력 
 */

import java.util.Scanner;
public class Problem14 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10: case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7 :
			grade ='C';
			break;
		case 6 :
			grade = 'D';
			break;
		default:
			grade='F';
		}
	
		
		switch(grade) {
		case'A':
			System.out.printf("전액 장학금 대상자입니다. 축하드립니다.");
			break;
		case'B':
			System.out.printf("반액 장학금 대상자입니다. 축하드립니다.");
		case'C':
			System.out.printf("근로 장학금 대상자입니다. 축하드립니다.");
		default :
			System.out.printf("장학금 대상자가 아닙니다.");
		break;
		
		}		
	}
}

