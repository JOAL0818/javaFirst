/*Day14(switch case문 연습)
  점수를 입력해서 90점이상이면 A, 80점이상이면 B, 70점이상이면 C, 60점이상이면 D, 그외에는 F학점이 나오도록 출력
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Jv_4_5 {

	public static void main(String[] args) throws java.io.IOException{  //예외처리
		int jumsu;    
		char hakjum;  
		String iput;
		
		System.out.println("***** result *****");
		System.out.print("Input jumsu:");   
		
		InputStreamReader kkk = new InputStreamReader(System.in);  
		BufferedReader bbb = new BufferedReader(kkk);			   
		iput=bbb.readLine();   
		jumsu=Integer.parseInt(iput); 
		
		switch(jumsu/10) {
			case 10: hakjum = 'A';              
				 break;         
			case 9:  hakjum = 'A';            
				 break;         
			case 8:  hakjum = 'B';             
				 break;          
			case 7:  hakjum = 'C';              
				 break;          
			case 6:  hakjum = 'D';               
				break;          
			default: hakjum = 'F';              
				 break;        
		}   
		System.out.println("Hakjum: " + hakjum);  
	}

}
