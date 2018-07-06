import java.lang.reflect.Array;

public class Practice {

	public static void main(String[] args) {
		int[]ar={10,30,70,40,15};
		
		
		
		int max = ar[0];   // 항상 0으로 초기화하는 것은 위험하다.
		int idx=0;
		int size=ar.length;
		int i;
		
		for(i=1;i<size;i=i+1) {
			if(max<ar[i]) {
				max=ar[i];
				idx=i;
			}
		}
		System.out.println("가장 큰 수 위치:"+idx);
		
		

	}

}
