/*메소드를 이용하여 가감승제산을 하는 
 * 프로그램을 작성하세요.
 * 메소드 규칙 4가지중에서 하나를 선택하여 코딩해주세요. 
 * 생성자 개념 도입.
 */

import java.util.Scanner;

public class Problem9_4 {

	private int su1;//멤버변수의 역할 => 100
	private int su2;// => 2
	 
	public static void TitleDraw(boolean title) {
		if(title == true) {	//if안쓰고 사용할수도 있지만, 						
							// 확장성을 생각한다면, 중복된코드를 줄일수 있다. 사용할 때마다 이 메소드를 호출만하면되니까 
							//이렇게 사용하는 것을 switching기법이라고 한다.
			System.out.println("=====가감승제산 프로그램=====");
			System.out.print("| 두 개의 정수를 입력해 주세요.^^ | ");
			System.out.println("");
			System.out.println("=======================");
		}
		System.out.println("=======================");
	}
		//생성자메소드(전달인자, 매개변수)
	public Problem9_4(int su1, int su2) {	//생성자이름은 클래스 이름과 같아야한다.
		this.su1 = su1;		// 생선자 메소드의 매개변수를 전달받아 좌측 this.su1에 대입하면 그게 다시 멤버변수에 대입된다. 
		this.su2 = su2;		// this는 생략이 가능하지만, 적어줘야 헷갈리지 않는다.
	}
	
	 private void add(int su1, int su2) {
		 	int add = su1 + su2;
		 System.out.printf("합계는 = %d\n", add);
		}
	 
	 private void sub(int su1, int su2) {
			int subtract = su1 - su2;
			System.out.printf("차는 = %d\n", subtract);
		}
	 
	 private void mul(int su1, int su2) {
		 int multiply = su1 * su2;
		 System.out.printf("곱셈은 = %d\n", multiply);
		}
	 
	 private void div1(int su1, int su2) {
		 int divide1 = su1 / su2;
		 System.out.printf("몫은 = %d\n", divide1);
			
		}
	 
	 private void div2(int su1, int su2) {
		 int divide2 = su1 % su2;
		 System.out.printf("나머지는 = %d\n", divide2);
		}
	 
	public static void main(String[] args) {
		int su1=0, su2=0;
		TitleDraw(true);
		
		Problem9_4 number = new Problem9_4(su1, su2); //클래스 옆 괄호 안이 채워진다.
		Scanner sc = new Scanner(System.in); 
		su1 = sc.nextInt();
		su2 = sc.nextInt();	
				
		number.add(su1, su2);
		number.sub(su1, su2);
		number.mul(su1, su2);
		number.div1(su1, su2);
		number.div2(su1, su2);		
		
		TitleDraw(false);
	}
}
