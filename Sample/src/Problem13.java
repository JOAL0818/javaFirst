/*(Switch case, default연습)
  은행에 500만원이 저축되어 있습니다. 
 50만원이면 백화점에 가고, 곰인형을 구입합니다. 
 아니면, 80만원이면 아울렛에가서 원피스를 구입한다.   
 아니면, 20만원이면 이마트에가서 런닝화를 구입한다.
 아니면, 10만원이면 술집(막걸리)으로 가서 술+안주 등을 먹습니다. 
 아니면, 잔돈의 10%를 과자값으로 사용합니다.(라면, 떡볶이,맛동산,오잉 등)
  잔돈은 다시 저축합니다.
*/

/*public class Problem13 {
	public static void main(String[] args) {
	 int bank=500;
	 int one =80, bear=50, run=20, beer=10, ramen=1, 맛=2;
	 
	 switch(bank) {												//다 계산하려고 break를 쓰지 않았다.
	 case 80: System.out.printf("백화점에서 원피스를 구입합니다.");
	 			one = one*3; 
	 case 50: System.out.printf("백화점에서 곰인형을 구입합니다.");
	 			bear=bear*1;
	 case 20: System.out.printf("이마트에서 런닝화를 구입합니다.");
	 			run=run*1;
	 case 10: System.out.printf("비어에서 술을 마십니다.");
	 			beer=beer*3;
	 default :  		
	 		int sum = one + bear + run + beer + ramen+ 맛;
	 		int nam=(bank-sum);
	 		System.out.printf("남은 돈은 %d만원입니다.",nam);	 
	 		
	 		//잔돈 10%계산합니다.
	 		int vat=(int)(nam*0.1);
		    int naname = naname-(ramen+맛) ;
		    bank = naname;
	 		
	 		break; 				 
	 	}		
	}
}*/
