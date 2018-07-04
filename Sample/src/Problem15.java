/* 이름,미술,음악,체육 점수를 입력받아서 총점,평균,학점,가산점,합격/불합격
 * 가산점:평균이 60점이상 10%의 가산점을 주고
 * 감산점:평균이 60점 이하이면 10%의 감산점을 줍니다.
 * 그리고 합격/불합격을 판정합니다.
 * 합격인 경우에는 평균이 60점 이상입니다.  
 */

import java.util.Scanner;
public class Problem15 {
	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/ 미술/ 음악/ 체육점수를 각각 입력해주세요.");
		String name=sc.next();
		int Mi=sc.nextInt();
		int Um=sc.nextInt();
		int Che=sc.nextInt();
		
		int sum = Mi+Um+Che;
		double aver = sum /(float)3;
		String grade = null;
		double add;
		String pass;
		System.out.println("이름:"+name);
		System.out.println("미술:"+Mi);
		System.out.println("음악:"+Um);
		System.out.println("체육:"+Che);
		System.out.println("총점:"+sum);
		System.out.printf("평균:%3.2f\n",aver);
		
		//switch case문으로 쓰는게 더 간결하다.
		if(100>=aver&&aver>=90) {
			grade="A";
		}
		if(90>aver&&aver>=80) {
			grade="B";
		}
		if(80>aver&&aver>=70) {
			grade="C";
		}
		if(70>aver&&aver>=60) {
			grade="D";
		}
		if(60>aver) {
			grade="F";
		}
		System.out.println("학점:"+grade);
		
		//삼항연산자(조건 연산자)를 사용하면 더 간략하게 표현할 수 있다. 
		if(aver>=60) {
			add=aver*1.1;			
		}
		else {
			add=aver-(aver*1.1);
		}
		System.out.printf("가산점 혹은 감산점을 포함한 평균점수: %3.2f\n",add);
		
		
		if(add>=60) {
			System.out.println(name+"학생은 합격입니다.");
		}
		else {
			System.out.println(name+"학생은 불합격입니다.");
	
		}		
	}
}
