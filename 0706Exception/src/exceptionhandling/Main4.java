/*package exceptionhandling;

public class Main4 {

	public static void main(String[] args) {
		
		//image0.png  imagae1.png  image2.png 이 3개의 문자열 1초마다 번갈아가면서 무한 반복해서 출하는 로직을 작성
		// % 나 배열을 생각해야한다. 
		int idx = 0;
		for(;;) {
			System.out.println("image"+(idx%3)+".png");
			idx=idx+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}*/

package exceptionhandling;

public class Main4 {

	public static void main(String[] args) {
		//김기태,이종범,최향남,이대진을 번갈아 가면서출력  -> 패턴이 없기 때문에 배열로 묶어야한다.
		//배열을 제외하고는 위와 같은 문제이다. 		
		String [] ar = {"김기태","이종범","최향남","이대진"};
		int size = ar.length;
		int idx =0;
		while(true) {
			
			try {
			System.out.println(ar[idx%size]);
			idx=idx+1;
			
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

