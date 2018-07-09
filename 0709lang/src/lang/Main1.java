package lang;

public class Main1 {

	public static void main(String[] args) {
		//1)
		//value 형 변수 생성
		int n =10;
		//value 형의 데이터를 대입
		//n에 저장된 데이터인 10이 복사
		int x = n;
		x=20;
		System.out.println(n); // n=10  
		
		//2)-1.
		//참조형 데이터의 복사 - 주소가 복사
		//10,20,30이 저장된곳의 주소를 복사
		int [] ar= {10,20,30};		
		int [] br=ar;
		//복사된 주소의 첫번째 데이터가 1000으로 변경된다.
		br[0]=1000;
		System.out.println(ar[0]); //ar[0]=1000
		
		
		//2)-2.참조형을 복사해 줄때 실제 데이터를 복사해주기		
		int [] cr = new int[ar.length];   //배열을 복사하기 위해서 새로운 공간을 생성		
		for(int i=0; i<ar.length;i=i+1) { //내부데이터를 복사
			cr[i]=ar[i];			
		}
		cr[0]=500;
		//이번에는 데이터를 복사해서 주었기 때문에 영향을 받지 않습니다.
		System.out.println(ar[0]);
	}

}
