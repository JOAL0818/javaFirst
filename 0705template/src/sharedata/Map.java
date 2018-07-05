package sharedata;

public class Map {
	private double latitude;
	private double longtitude;
	
	//매개변수가 없는 생성자 - default constructor
	//생성자는 source - generator constructor Super에서 만들 수 있다.
	public Map() {
		super();		
	}
	
	
	
	//접근자 메소드 - getter & setter
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	
	
	
	
		
	
	//매개변수가 있는생성자
	//생성자는 source - generate constructor에서 만들 수 있다.
	//location 파일에 에러생성 주는게 없으니까 -> longitude,latitude 추가해줘라
	public Map(double latitude, double longtitude) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
	}





	//지도를 출력하는 메소드
	public void showMap() {
		System.out.println("위도:"+latitude+"\n경도"+longtitude+"\n위 위치의 지도를 출력합니다.");
	}

}
