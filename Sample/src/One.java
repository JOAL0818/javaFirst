/*1.Day14-1)(반복문)
  	1-100까지의 합
  2.Day14-2)(반복문)
  	1-100까지 중 5의배수의 합
*/

//1.Day14-1)(반복문) : 1-100까지의 합
/*public class One {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		for( ;i<=100;i++) { //for( ;i<101;i++)
			sum+=i;
		}
		System.out.printf("1~100사이의 합계는 ="+sum);

	}

}*/



//2.Day14-2)(반복문)1-100까지 5의배수의 합
public class One {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		for( ;i<=100;i+=5) { 
			sum+=i;
		}
		System.out.printf("1~100사이의 합계는 ="+sum);

	}

}

