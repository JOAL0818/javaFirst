/* 10명 학생의 국어성적을 입력받고 점수가 80점이상인 학생이 몇명인지 구하는 프로그램 작성
 * 조건 1) 점수는0점이상, 100점이하
 * 조건 2) 예외처리
 */
import java.util.Scanner;
public class Problem18{
	public static void main(String[]args) {
		int count=0;
		int[] student =new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<student.length;i++) {
			System.out.printf("%d번째 학생의 점수는:", i+1);
			student[i]=sc.nextInt();
			
			if(student[i]<0||student[i]>100) {		//i를 하나 빼줌으로서 다시 for문으로 올라간다.
				System.out.println("다시 입력해 주세요.");
				i--;
			}
		}
		for(int i=0;i<student.length;i++) {
			if(student[i]>=80) {
				count++;
			}
			System.out.printf("점수가 80점 이상인 학생은 %d명 입니다.", count);
		}
	}
}


