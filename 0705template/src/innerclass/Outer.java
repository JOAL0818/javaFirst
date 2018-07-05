package innerclass;

public class Outer {
	
	
	/*
	//local inner class : 메소드 안에 만드는 클래스
	//메소드가 호출되서 실행될 때 만들어졌다가 없어지는 클래스
	//클래스가 메소드를 호출할때만 존재하기 때문에 머ㅔ모리 효율을 높일 수도 있습니다.
	public void sample() {
		class Inner{			
		}
	}*/
	
		
	/*
	//Static inner class : 내부클래스 안에 static 멤버가 있으면 일반 inner class는 에러를 발생시킵니다.
	//이때 class 앞에 static을 붙여주면 해결!
	static class Inner{
		static int n;  
	}*/
	
	
	/*	//일반 innner class : 클래스 안에 존재하는 클래스 
	class Inner{
		
	}
}

class Foreign{
	Inner inner = new Inner();
}*/
	
}
