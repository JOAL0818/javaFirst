/* (알고리즘, else if문)
 * 2차원 공간상의 좌표값을 입력하여 몇사분면인지 확인하세요. 
 */

import java.util.Scanner;
public class Problem11 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("좌표입력(x,y)");		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x==0&&y==0) {
			System.out.println("입력한 좌표는 원점입니다.");
		}
		else if(x==0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 y축 위에 있습니다.");
		}
		else if(y==0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 x축 위에 있습니다.");
		}
		else if(x<0&&y>0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 제1사분면입니다.");
		}
		else if(x>0&&y>0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 제2사분면입니다.");
		}
		else if(x<0&&y<0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 제3사분면입니다.");
		}
		else if(x>0&&y<0) {
			System.out.println("입력한 좌표("+x+" "+y+")는 제4사분면입니다.");
		}		
	}
}