
/*주어진 초를 이용해 몇 시간 몇 분 몇 초인가를 알아보는 프로그램을 작성합니다.
   예시) 10000초
*/
import java.util.Scanner;
public class Problem5 {

   public static void main(String[] args) {
      int inpt, second, min, hour, day;
      System.out.println("초를 입력하시면 시간 단위로 변환됩니다.");
      Scanner sc=new Scanner(System.in);
      second=sc.nextInt();
      inpt=second;
      min=second/60;
      hour=min/60;
      day=hour/24;
      hour=hour%24;
      min=min%60;
      second=second%60;
      System.out.println(inpt + "초는 " + day + "일 " + hour + "시간 " +  min +"분 " + second + "초입니다.");
   }
}


//주어진 초를 이용하여 몇시간 몇분 몇초인가를 알아보는 프로그램을 작성합니다. -내코드
//  예시) 10000시간 : 10000시간의 법칙

/*import java.util.Scanner;
public class Problem5 {
	public static void main(String[] args) {
		int S;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("알고자하는 '초'를 입력하세요:");
		S=scn.nextInt();
		
		int na=S%60;
		int H=(S/60)/60;
		int M=H%60;
		
		System.out.println("입력한 "+S+"초는"+H+"시간"+M+"분"+na+"초 입니다.");
		

	}

}*/
