package lang;

import java.util.Scanner;

public class MainPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("원하는 금액을 입력하세요");
		int money=sc.nextInt();		
		int Oman, man;
		
		Oman=money/50000;
		man=(money%50000)/10000;
		
		System.out.println("5만원권:"+Oman+"장\n1만원권:"+man+"장");
		
		
		sc.close();
	}

}
