/*Day14(if else문 연습)
  2018이라는 년도의 짝수해여부/홀수해여부/윤년여부 출력
*/

public class IfTest {

	public static void main(String[] args) {
		int year=2018;
		
		if(year%2==0) {
			System.out.println(year+"는 짝수해입니다.");
		}
		else {
			System.out.println(year+"는 홀수해입닌다.");
		}
		if(year%2!=1) {
			System.out.println(year+"짝수해입니다.");
		}
		else {
			System.out.println(year+"는 홀수해입니다.");
		}
		if((year%4)==0 && (year%100)!=0||(year%400==0)){
			System.out.println(year+"는 윤년입니다.");
		}
		else {
			System.out.println(year+"는 윤년이 아닙니다.");
		}
	}
}
