package constructor;

public class Practice {
	//생성자를 이용하지 않는 초기화 1)static Initializer
		static { //가장처음 한번만 수행됩니다.
			System.out.println("맨 처음 한번만 수행되는 내용");
		}
		
		//Initializer
		{	//new practice할때마다 사용
			System.out.println("인스턴스를 만들 때마다 수행되는 내용");
		}
		
	
	//생성자 
	public Practice() {
		name="noname";
	}
	
	//생성자 오버로딩(동일한 이름의 메소드가 2개 이상 있는 겨우)
	public Practice(String arg) {		//practice3에 park이라고 출력되는 이유!
		name = arg;
	}
	
	
	
	
	//이름을 저장하기 위한 인스턴스 변수를 선언
	private String name;

	//name의 접근자 메소드 - 자동으로 만드는방식 이용
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//this 활용
	public void display() {
		String name = "지역변수 name";
		System.out.println(name);
		//this를 붙이면 지역변수에서 찾지 않고, instance변수에서 찾아온다.
		System.out.println(this.name);
	}	
}


