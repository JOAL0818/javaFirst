package innerclass;


//Thread를 상속받은 클래스
public class ThreadEx extends Thread {
	//오버라이딩 한 메소드라는 것을 나타내는 어노테이션
	@Override //오타가 많을 것 같을때 이걸 적어주면 오타가 있는지 없는지 알 수 있다.
	public void run() {
		try {
			for(int i=0; i<10;i=i+1) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {}
	}
	
	
}
