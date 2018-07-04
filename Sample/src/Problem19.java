import java.util.Scanner;

//배열로 구구단 만들기(2차원 배열 이용)

public class Problem19 {
	public static void main(String[] args) {
		int i,j;
		int [][]gugu = new int[9][9];
		
		for(i=2;i<9;i++) {
			for(j=1;j<9;j++) {
				gugu[i][j]=i*j;			
			}
		}
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for(int k=0; k<9;k++) {
			System.out.println((input)+"*"+(k+1)+"="+(input));
		}
	}
}
