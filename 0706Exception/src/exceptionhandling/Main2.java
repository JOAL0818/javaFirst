package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		//문자열 배열을 생성
		String [] ar = {"Morning","Afternoon","Evening"};

		
		try {
		//배열의 데이터를 순회하면서 출력
		int size = ar.length;
		
		//size까지 진행해서 예외가 발생했다. 
		//size의 = 아래 출력 두문째 문장 없애면 에러 해결
		for(int i=0; i<size; i=i+1) { //
			System.out.println(ar[i]);
			if(i>1) {
				throw new NumberFormatException("강제로 예외발생");
			}
			
			//System.out.println(Integer.parseInt(ar[i])); // NumberFormatException 발생
		}
		}
		
		catch(ArrayIndexOutOfBoundsException e) {   //여기서 출력되는 메시지를 보고 오류를 추적한다. 
			                                //예외 이름은 e 로 하는 것은 관례이다. 
			//예외 내용출력
			System.out.println(e.getMessage());
			//예외 내용을 출력
			e.printStackTrace();			
		}
		
		catch(NumberFormatException e) { //Exception e 라고 적어도된다.
			//예외 내용출력
			System.out.println(e.getMessage());
			//예외 내용을 출력
			e.printStackTrace();				
		}
		
		finally {
			System.out.println("예외발생 여부에 상관없이 수행");
		}

		
	}
}
