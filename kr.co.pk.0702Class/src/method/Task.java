package method;

public class Task {
	public void javaDisplay() {    //javaDisplay 이 이름으로 묶어놓고 , 다른곳에서 쓸수있다.
		//이름은 마음대로 쓸 수 있다. 
		//public은 패키지가 달라도 부를수 있지만, public이 없는 default는 반드시 디렉토리(패키지)가 같아야한다.
		for(int i=0;i<3;i=i+1) {
			System.out.println("Hello Java");
			}
	}

	
	public int tot(int n) {  //n은 매개변수 
		int sum =0;
		for(int i =1; i<n+1; i=i+1) {  //for(int i =1; i<101; i=i+1) {
			sum=sum+i;
		}
		//System.out.println("합계:"+sum);  //출력메소드
		return sum; // return 반환값이 가야하기 때문에 이 뒤에 출력문장이 오면 오류 메시지가 뜬다.				
	}	
	
	
	
	//로그인 처리 메소드
	//public 결과형 이름(매개변수){
      public boolean login(String id, String pw) {
    	  boolean result=false;
    	  if(id.equals("root")&&pw.equals("1234")) { //문자열은 같은것 비교할때 반드시 equals
    		result=true;
    		}
    	  return result;
      }
		
	//회원탈퇴
	//public 결과형 이름(매개변수){
	public boolean deleteMember(String id, String pw) {
	boolean result=false;
	  if(id.equals("root")&&pw.equals("1234")) { //문자열은 같은것 비교할때 반드시 equals
		result=true;
		}
	  return result;
	}
}
