/*Day14(else if문 연습)
  점수를 입력해서 90점이상이면 A, 80점이상이면 B, 70점이상이면 C, 60점이상이면 D, 그외에는 F학점이 나오도록 출력
*/

import java.io.*; // 입출력package, *는 와일드카드로 이렇게 적어주면 bufferedReader..이런거 다 안적어줘도 되는것

public class Jv_4_4 {

	public static void main(String[] args) throws java.io.IOException{  //예외처리
		int jumsu;    //float로 해도 괜찮다. 
		char hakjum;  //학점은 문자니까 
		String iput;
		
		System.out.println("***** result *****");
		System.out.print("Input jumsu:");   //점수입력하라
		InputStreamReader kkk = new InputStreamReader(System.in);  
		BufferedReader bbb = new BufferedReader(kkk);			  
		iput=bbb.readLine();  
		jumsu=Integer.parseInt(iput); 
		
		if(jumsu>=90)  //여기서 부터 알고리즘 시작 '만약에' 이 점수가 90보다 크거나 같냐
			hakjum='A';  // 크거나 같으면 A다 
		else if(jumsu>=80)
			hakjum='B';
		else if(jumsu>=70)
			hakjum='c';
		else if(jumsu>=60)
			hakjum='D';
		else
			hakjum='F';
		System.out.println("Hakjum:"+hakjum);  //A면 중간 문장들 다 뛰어넘고 이줄로 내려와서 출력을 실행하게된다.
	}

}


