/* 일반배열방식(객체x)
 *10개의 데이터를 초기화 시키고 총점을 구하는 프로그램을 작성해봅니다.
 *데이터] 90 80 60 70 93 100 50 66 100 88 
 */
/*public class ArrayTest {
	public static void main(String[] args) {
		int sung[]= {90, 80, 60, 70, 93, 100, 50, 66, 100, 88};
		int total=0;
		
		
		for(int i=0;i<sung.length;i++) {
			total+=sung[i];			
		}
		System.out.println("총점:"+total);
	}
}*/



//10개의 데이터를 입력받아서 총점을 계산하는 프로그램
import java.util.Scanner;
public class ArrayTest{
	public static void main(String[] args) {
		int[] jumsu=new int[10];
		int total = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("성적데이터를 10개 입력하세요.");
		
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i]=sc.nextInt();
			total+=jumsu[i]; //총점구하기
		}
		System.out.println("총점은="+total);
		System.out.println("평균은="+total/jumsu.length);
	}
}


