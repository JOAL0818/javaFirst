/*Day14(알고리즘)
  커피가격은 잔당 4000원, n잔의 커피구입. 이때 부가세는 10%(VAT별도/포함). 거스름돈은 얼마인가요? 
*/

//선생님 코드
import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		int payment, quantity;
		int coffeeCost=4000;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("지불금액을 입력하세요:");
		payment=scn.nextInt();
		
		System.out.println("커피 구매수량을 입력하세요:");
		quantity=scn.nextInt();
		
		
		int vat = (int)((coffeeCost*0.1)*quantity);	//부과세구하기
		int hapgye = coffeeCost*quantity;				//상품총액구하기
		int charge =payment-hapgye-vat;//거스름돈구하기
		
		
		System.out.println("가진 돈:"+payment+"원 입니다.");
		System.out.println("구매할 커피 잔 수:"+quantity+"잔 입니다.");
		System.out.printf("부가세:%0.f",vat+"원 입니다.");
		System.out.println("거스름돈:"+charge+"원 입니다.");
		
	}

}





//내 코드
/*import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) throws java.io.IOException {
		int mon, na,n,sum;
		int a=4000;
		float vat;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("가진 돈을 입력해주세요->");
		mon=scn.nextInt();
		
		System.out.println("구매할 커피 잔 수->");
		n=scn.nextInt();
		
		vat=(a*0.1f)*n;
		sum=a*n;
		na=(int) (mon-(sum+vat));
		
		
		System.out.println("가진 돈:"+mon);
		System.out.println("구매할 커피 잔 수:"+n);
		System.out.printf("부가세:%.0f\n",vat);
		System.out.println("거스름돈:"+na);	
		
	}
}*/
