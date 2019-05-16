package Day_20190516;

public class Truck extends Car{
/*
 * 1.적재량을 담을 수 있는 필드
 * 2.적재량 return해주는 메소드
 */
//	private double gram;
//	Truck(double gram){
//		this.speed=speed;
//		this.color=color;
//		this.gram=gram;
//		
//	}
//	
//	double Kg() {
//		gram=5;
//		return gram;
//	}
//	public void Tcars() {
//		if(color=="빨강") {
//			System.out.println(color+"트럭의 속도는"+speed+"이고 적재량는"+gram+"톤 입니다.");
//		}
//		else {
//			System.out.println(color+"트럭의 속도는"+speed+"이고 적재량는"+gram+"톤 입니다.");
//		}
//	}
	//적재량 필드선언
	private int capacity;
	Truck(int speed, String color, int capacity){
		super(speed,color);
		this.capacity=capacity;
	}
	int getCapacity() {
		return capacity;
	}
}
