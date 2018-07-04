/*Day14(반복문)
  > 모양으로 출력 : 상반부는 #, 하반부는@를 사용해서 출력

*/
public class NestedForStar {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
		System.out.println();
		}
	for(int i=0;i<11;i++) {
		for(int j=0;j<=10-i;j++) {
			System.out.print("@");
		}
		System.out.println();
	}
	}
}
