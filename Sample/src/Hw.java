import java.io.*;
public class Hw{
	public static void main(String[]args)throws IOException{
		int jumArr[][];
		jumArr=new int[6][3];
		String nameArr[];
		nameArr=new String[6];
		
		
	}
}





/*import java. util.Random;
import java.util. Scanner;

public class Hw{
	public static void main(String args[]) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("스무고개 게임 1.게임설명,2.시작,3.종료");
			int help=sc.nextInt();
			
			if(help==1) {
				System.out.println("스무고개 게임 설명");
				System.out.println("1-500 중 컴퓨터가 생성한 1개의 숫자를 20번 안에 맞추면 됩니다.");
			}
			else if(help==2) {
				while(true) {
					int cnt=0;
					Random ram = new Random();
					int com = ram.nextInt(500)+1;
					System.out.println("숫자선정완료. 게임을 진행하세요");
					
					while(cnt<20) {
						System.out.println("컴퓨터의 숫자는 몇일까요?");
						int play=sc.nextInt();
						++cnt;
						
						if(play==com) {
							System.out.println("정답입니다."+cnt+" 번 만에 맞췄습니다.");
							cnt=0;
							System.out.println("게임을 계속 진행하시겠습니까? 1.예/2.아니오");
							int go = sc.nextInt();
							if(go==2) {
								System.out.println("게임끝");
								System.exit(0);
							}else if(go==1) {
								System.out.println("게임계속 진행");
								break;
							}
						}else if(play>com) {
							System.out.println("시도횟수:"+cnt+"\t숫자가 너무 높아요. 조금만 내려주세요");
						}else if(play<com) {
							System.out.println("시도횟수:"+cnt+"\t숫자가 너무 낮아요. 조금만 올려주세요");
						}		
					}
					 System.out.println("정답은:"+com+" 입니다.");
				}
			}
			else if(help==3) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}	
		}
	}
}*/

