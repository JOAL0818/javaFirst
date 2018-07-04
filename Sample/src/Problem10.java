/* 다중 if문 연습
 3개의 숫자를 입력받아서 가장 큰수(max), 중간수(med), 가장작은수(min)를 찾아서 출력하는 프로그램을 작성하세요.
  예) 23 45 12
   MAX=45, MED=23, MIN=12
*/

import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		int first,second,third;
		int MAX,MED,MIN;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하세요->");
		first=scn.nextInt();
		second=scn.nextInt();
		third=scn.nextInt();
		
		if(first>second) {
			if(first>third) {
				MAX=first;
				if(second>third) {
					MED=second;
					MIN=third;
				}
				else {
					MED=third;
					MIN=second;
				}
			}
			else {
				MAX=third;
				MED=first;
				MIN=second;
				}
			}
		else {
			if(second>third) {
				MAX=second;
				if(first>third) {
					MED=first;
					MIN=third;
				}
				else {
					MED=third;
					MIN=first;
				}
			}
			else {
				MAX=third;
				MED=second;
				MIN=first;
			}
	}		
		System.out.println("큰수,중간수,작은수를 출력합니다.");
		System.out.println("MAX="+MAX);
		System.out.println("MED="+MED);
		System.out.println("MIN="+MIN);		
	}
}
