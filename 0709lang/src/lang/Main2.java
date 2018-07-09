package lang;

public class Main2 {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNum(1);
		user1.setName("아이린");
		String[] hobbies= {"노래","춤"};  //배열안에 데이터 값을 넣어준다.
		user1.setHobbies(hobbies);
		System.out.println(user1);  //출력값: User [num=1, name=아이린, hobbies=[노래, 춤]]
									//toString을 호출해서 내부내용확인 : String을 사용했으니까 이렇게 결과 바로확인가능
		
		//user1의 데이터가 저장된 곳의 주소를 user2에 복사
		User user2 = user1; 
		user2.setNum(2);
		System.out.println(user1);  //인스턴스도 참조형 -> user2가 바뀌면 user1의 데이터도 바뀐다.
		
		
		User user3 = user1.clone();
		user3.setNum(3);
		user3.setName("수지");
		user3.getHobbies()[0]="연기";
		System.out.println(user1);  //User [num=2, name=아이린, hobbies=[연기, 춤]]
		System.out.println(user3);	//User [num=3, name=수지, hobbies=[연기, 춤]]
									//hobbies만 영향을 받는다. - 참조형이라서
		 							//string은 왜 영향없지? String은 참조형이지만, value형처럼 사용되어 데이터가 1개씩 저장된다. :date도 

		
		
		
		}
	
	}

