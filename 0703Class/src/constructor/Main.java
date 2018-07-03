package constructor;

public class Main {

	public static void main(String[] args) {
		//Practice 클래스의 인스턴스 생성 
		Practice practice1= new Practice();
		//practice1.setName("noname");
		System.out.println(practice1.getName());
		
		Practice practice2= new Practice();
		//practice2.setName("noname");
		System.out.println(practice2.getName());
		
		Practice practice3=new Practice("park");
		System.out.println(practice3.getName());
		
		
		//API 도큐먼트 활용의 예1)lastIndex
		String str = "Hello world";
		int r = str.lastIndexOf("llo");
		System.out.println(r);
		//API 도큐먼트 활용의 예1)length
		r= str.length();
		System.out.println(r);
	
		
		//this연습
		practice3.display(); //"지역변수 name"[지역변수] , park[인스턴스변수] 두가지가 출력.
		
	
		                    
				
	}

}
