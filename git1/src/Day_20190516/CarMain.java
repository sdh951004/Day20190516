package Day_20190516;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 1. 빨간색 승용차의 속도는 200이고 좌석수는 5개 입니다.
		 * 2.검정색 트럭의 속도는 100이고, 적재량은 5톤입니다.
		 */
//		Sedan car=new Sedan(5);
//		car.speed=200;
//		car.color="빨강";
//		car.Cars();
//		System.out.println("-----------------------------");
//		Truck Tcar=new Truck(5);
//		Tcar.color="검정";
//		Tcar.speed=100;
//		Tcar.Tcars();
//		
		//Sedan클래스의 객체 선언
		Sedan sedan=new Sedan(100,"빨간색");
		//Truck클래스의 객체 선언
		Truck truck=new Truck(70,"은색",5);
		//속도 증가 메소드 호출
		sedan.speedUp(15);
		truck.speedUp(10);
		
		//Sedan클래스의 seatNum 필드값 조정
		sedan.setSeatNum(5);	 //getter setter 방식 이용해서 설정함.
		//출력문 작성
		System.out.println(sedan.color+"승용차 속도는 "+sedan.speed+"이고 좌석수는 "+sedan.getSeatNum()+"개 입니다.");
		System.out.println(truck.color+"트럭 속도는 "+truck.speed+"이고 적재량는 "+truck.getCapacity()+"톤 입니다.");
	}

}
