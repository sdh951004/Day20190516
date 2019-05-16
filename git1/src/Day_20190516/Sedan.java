package Day_20190516;

public class Sedan extends Car {
	/*
	 * 1. 좌석수를 담을 수 있는 필드
	 * 2. 좌석수를 return해주는 메소드
	 */
//	public static final String red="빨강";
//	public static final String black="검정";
//	public String color=red;
//	protected int sit;
//	Sedan(int sit){
//		this.color=color;
//		this.speed=speed;
//		this.sit=sit;
//	}
//	
//	int cheir() {
//		sit=5;
//		return sit;
//	}
//	
//	public void Cars() {
//		if(color=="검정") {
//			System.out.println(color+"승용차의 속도는"+speed+"이고 좌석수는"+sit+"개 입니다.");
//		}
//		else {
//			System.out.println(color+"승용차의 속도는"+speed+"이고 좌석수는"+sit+"개 입니다.");
//		}
//	}//
	//필드 선언
	private int seatNum;
	//생성자 선언
	Sedan(int speed, String color){
		super(speed,color);
		
	}
	//메소드 선언
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	
}
