/*Day14(알고리즘)
  세 과목의 성적을 입력하여 합계와 평균을 구하는 프로그램을 작성하세요.
*/ 

//선생님코드
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		int kor,eng,mat,hap;
		float aver;
		
		Scanner scn = new Scanner(System.in);   
		//scn은 오브젝트(원래명칭) =(별칭으로) 'reference 변수 = 참조변수 = 인스턴스'  라고 하기도한다.
		
		System.out.println("국어점수를 입력해주세요->");
		kor = scn.nextInt();
		
		System.out.println("영어점수를 입력해주세요->");
		eng = scn.nextInt();
		
		System.out.println("수학점수를 입력해주세요->");
		mat = scn.nextInt();
		
		hap=kor+eng+mat;
		aver=hap/3.0f;  //3.0f 이렇게 적어줘야 위에 float aver라고 선언한것 처럼 실행이된다. 
						//그냥 3만 넣으면 정수이기 때문에 결과도 정수형으로 나오게된다.
		
		System.out.println("합계:"+hap);
		System.out.println("평균:"+aver);
		System.out.printf("평균:%6.3f",+aver); //소수점 이하 어디까지르 나타내고 싶으면, c처럼 표현해주면 된다.
	}
}


//내 코드
 
/*import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		int a,b,c;
		int sum, ave;
		
		Scanner sc = new Scanner(System.in);   //sc라는 오브젝티브 파일을 만들어야한다. sc대신에 어떤 문자로도 가능, 반드시 있어야한다.
		a = sc.nextInt();						//그래야 여기서 내려받을 수 있다.
		b = sc.nextInt();
		c = sc.nextInt();
		
		sum=a+b+c;
		ave=sum/3;
		
		System.out.print("국어점수:" + a + "\n수학점수:" + b + "\n영어점수:" + c + "\n");
		System.out.println("합계:"+sum);
		System.out.println("평균:"+ave);		
	}
}*/
