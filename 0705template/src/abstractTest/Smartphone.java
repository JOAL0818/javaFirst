package abstractTest;

//상위 클래스 생성 : Android와 Iphone 클래스의 인스턴스 주소를 하나의 변수에 저장할 수 있도록 하기 위해서 작성한 클래스 - 인스턴스를 생성할 필요 없음.
public abstract class Smartphone { //abstract 추가해서 추상클래스로 변신 : 인스턴스를 만들 수 없는 클래스
	
	//하위 클래스의 메소드와 오버라이딩 관계를 만들기 위해서 생성한 메소드.
	//추상 메소드 : 내용이 없는 메소드로 상속받은 곳에서 반드시 재정의 해야합니다. -> abstract 추가만 하면에러 : 중괄호 지우고 ;추가하면 에러가 없어진다.
	public abstract void call();
		
	
}
