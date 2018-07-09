package lang;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		int x =-1;
		Scanner sc = new Scanner(System.in);
		
		//데이터가 유효할때까지 돌리고 싶으면 무한반복문사용 : while/for 둘다 사용가능
		while(true) {  
			
			System.out.println("정수입력");
			String temp = sc.nextLine();
			
			try{
				x=Integer.parseInt(temp);	
				break;
			}
			catch(Exception e){
				System.out.println("정수를 입력하세요");				
			}	
			
		}
		System.out.println(x);	
		sc.close();
		

	}

}
