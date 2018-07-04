/*방법2 - scan으로 할 때보다 문장 수를 많이 줄일 수 있다 : 도스 창처럼 한다. - 도스창이기 때문에 하나에 하나씩 밖에 실행할 수는 없다.
 	왼쪽 package창에서 실행중인 파일선택 후, 오른쪽마우스 클릭-run as - run configurations 
  	 -> Name 및 파일 위치 제대로 되었는지 확인 -> arguments탭 선택 
  	 -> 5 + 4 이렇게 입력을 한다. (주의: 띄어쓰기를 해야지 구분을 한다.)  						
	입력: 5+4, 	50-40
	출력: 5+4=9,	50-40=10
*/

public class Problem6 {

	public static void main(String[] args) {
		String data=null;
				
		int first=Integer.parseInt(args[0]);   
		String operator=args[1];
		int second=Integer.parseInt(args[2]);
		
		if(operator.equals("+")) 
			System.out.println("결과는"+first+"+"+second+"="+(first+second)+"\n");
		
		if(operator.equals("-"))
			System.out.println("결과는"+first+"-"+second+"="+(first-second)+"\n");
		
		if(operator.equals("x")) //정규식에 *가 다른의미를 가지고 있는게 있어서 x로 바꿔주어야 실행이된다.
			System.out.println("결과는"+first+"*"+second+"="+(first*second)+"\n");
		
		if(operator.equals("/"))
			System.out.println("결과는"+first+"+/"+second+"="+(first/second)+"\n");
		 
		
	}
}


//방법1
// 입력: 5+4, 	50-40
// 출력: 5+4=9,	50-40=10

/*import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		String data=null;
		
		
		
		while(true) {
		int first, second;
		String operator;
		
		
		//scanner 하나에 다 적어도 결과는 같다. 그렇게 될경우, 오브젝티브 파일 하나에 모든게 다 종속이 된다.
		Scanner scn=new Scanner(System.in);
		System.out.print("인수 세가지 중에서 첫번째를 입력하세요:");
		first= scn.nextInt();
		
		Scanner scn2=new Scanner(System.in);
		System.out.print("인수 세가지 중에서 두번째를 입력하세요:");
		operator= scn2.next();
		
		Scanner scn3=new Scanner(System.in);
		System.out.print("인수 세가지 중에서 세번째를 입력하세요:");
		second= scn3.nextInt();
		
		//if(operator=="+") - 이렇게는 기본형 데이터 타입일때, 가능
		if(operator.equals("+")) // 참조형 데이터 타입이기 때문에 이렇게 물어봐야한다.
			System.out.println("결과는"+first+"+"+second+"="+(first+second)+"\n");
		
		if(operator.equals("-"))
			System.out.println("결과는"+first+"-"+second+"="+(first-second)+"\n");
		
		if(operator.equals("*"))
			System.out.println("결과는"+first+"*"+second+"="+(first*second)+"\n");
		
		if(operator.equals("/"))
			System.out.println("결과는"+first+"+/"+second+"="+(first/second)+"\n");

		}
	}
}*/
