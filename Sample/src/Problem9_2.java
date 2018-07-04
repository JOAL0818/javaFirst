/*메소드를 이용하여 가감승제산을 하는 
 * 프로그램을 작성하세요.
 * 메소드 규칙 4가지중에서 하나를 선택하여 코딩해주세요. 
 * 메소드 이용 세번째 개념 도입.
 */

import java.util.Scanner;

public class Problem9_2 {
	int su1=0, su2=0, add=0, subtract=0, multiply=0, divide1=0, divide2=0;
		 
	 private void read() {
			Scanner sc = new Scanner(System.in); 
			System.out.printf("두 개의 정수를 입력해 주세요.^^ : ");
			su1 = sc.nextInt();
			su2 = sc.nextInt();		
		}
	 
	 private void add() {
		 add = su1 + su2;
		 System.out.printf("합계는 = %d\n", add);
		}
	 
	 private void sub() {
			subtract = su1 - su2;
			System.out.printf("차는 = %d\n", subtract);
		}
	 
	 private void mul() {
		 multiply = su1 * su2;
		 System.out.printf("곱셈은 = %d\n", multiply);
		}
	 
	 private void div1() {
		 divide1 = su1 / su2;
		 System.out.printf("몫은 = %d\n", divide1);
			
		}
	 
	 private void div2() {
		 divide2 = su1 % su2;
		 System.out.printf("나머지는 = %d\n", divide2);
		}
	 
	public static void main(String[] args) {
		Problem9_2 number = new Problem9_2();
		number.read();
		number.add();
		number.sub();
		number.mul();
		number.div1();
		number.div2();		
	}
}
