package sharedata;


//위치정보를 가져오는 클래스
public class Location {
	public double latitude;
	public double longitude;
	
	
	
	public void getLocation() {
		//생성자를 이용한 데이터전달
		//Map map = new Map(latitude,longitude);
		//map.showMap();
		
		
		//setter를 이용한 데이터전달 
		// * 생성자를 이용한 데이터 전달에 비해 문장들이 길어진다. 
		Map map =new Map();
		map.setLatitude(latitude);
		map.setLongtitude(longitude);
		map.showMap();
				
	}
	
}
