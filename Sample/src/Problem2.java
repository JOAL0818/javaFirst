/*Day14(알고리즘)
  주어진 숫자 단위 구하기
  예) 345이면 3은 백의자리, 4는 십의자리, 5는 일의 자리 표시해주는 프로그램 작성
*/

import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		//int num = 345;
		int num, mok1,mok2,nam;
		
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt(); //345를 입력했을때 
		
		mok1=num/100;	//몫 구하기 -> 3
		nam=num%100;	//나머지 구하기 -> 45
			
		mok2=nam/10;	//몫 구하기 -> 4
		nam=num%10;		//나머지 구하기->5
		
		System.out.println("입력받은 값은="+num);
		System.out.println("백의자리="+mok1);
		System.out.println("십의자리="+mok2);
		System.out.println("일의자리="+nam);

	}

}
