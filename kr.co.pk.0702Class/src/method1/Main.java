package method1;

public class Main {

	public static void main(String[] args) {
		job.display();  //static 메소드는 이렇게 인스턴스(객체)를 만들지않고 불러도된다.


		
		int x =10;			//메소드에게 value형의 데이터를 넘겨주었습니다. 
							//절대로 넘겨준 데이터에 변화가 일어나지 않습니다.
		job.incValue(x); 
		System.out.println(x);    //출력값은 10

		
		int [] ar = {100,200}; 	//메소드에게 reference형의 데이터를 넘겨주었습니다.
								//넘겨준 데이터에 변화가 발생할 수 있습니다.
								//이런 경우에는 document를 읽어보거나 데이터를 확인해봐야합니다.		
		job.incReference(ar);
		System.out.println(ar[0]);  //예상값:101(주소있는 장소의 첫번째 값에+1이니까)  **값이 바뀔수도 있으니 확인해봐야한다. 
		
		
		
		job job = new job(); //static이 없으므로 불러줄때 객체를 만들어야한다. 
		System.out.println(job.sum(6000));  //10000하면 안된다... -> 메모리가 부족해서

	
	
		System.out.println(job.fiboNoRecursion(10));
	
	}
}
