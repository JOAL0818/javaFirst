/* 배열
 *10개 데이터를 입력받아서 최대값과 최소값을 구하고, 합계를 구하는 프로그램 작성
 */

import java.util.Scanner;
public class Problem20 {
	public static void main(String[] args) {
		int[] data=new int[10];
		int max,min,sum=0;
		int save;

		for(int i=0;i<10;i++) {
		Scanner sc = new Scanner(System.in);
		data[i]=sc.nextInt();
			if(data[i]>data[i+1]) {
				save=data[i];
				data[i]=data[i+1];
				data[i+1]=save;
			}
			}
		}
		
		
		
	//	System.out.println("합계는="+sum);
	}

