import java.util.Scanner;

/*메소드를 이용하여 가감승제산을 하는 
 * 프로그램을 작성하세요.
 * 메소드 규칙 4가지중에서 하나를 선택하여 코딩해주세요. 
 * 일반적인 프로그램 방식 도입.
 */
public class Problem9_1 {

	public static void main(String[] args) {
		int su1=0, su2=0, add, subtract, multiply, divide1=0, divide2=0;
		 add=subtract=multiply=0;
		 
		Scanner sc = new Scanner(System.in); 
		System.out.printf("두 개의 정수를 입력해 주세요.^^ : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		add = su1 + su2;
		subtract = su1 - su2;
		multiply = su1 * su2;
		divide1 = su1 / su2;
		divide2 = su1 % su2;
		
		System.out.printf("%d\n", add);
		System.out.printf("%d\n", subtract);
		System.out.printf("%d\n", multiply);
		System.out.printf("%d\n", divide1);
		System.out.printf("%d\n", divide2);
	}

}
