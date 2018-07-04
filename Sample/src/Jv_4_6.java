/*(for, while, do~while 반복문 연습)
  1-100까지의 합을 for/while/do~while 반복문을 이용해 각각 출력
*/
public class Jv_4_6 {

	public static void main(String[] args) {
		int n, hap;
		
		System.out.println("***** result *****");
		
		n=hap=0;
		for(n=1;n<=100;n++)
			hap+=n;
		System.out.println("1+2+3+...+100="+hap+"(for statement)");
		
		n=1;
		hap=0;
		while(n<=100) {
			hap+=n;
			n++;
		}
		System.out.println("1+2+3+...+100="+hap+"(while statement)");
		
		n=1;
		hap=0;
		do {
			hap+=n;
			n++;
			}
		while(n<=100);
		System.out.println("1+2+3+...+100="+hap+"(do~while statement)");
	}
}

