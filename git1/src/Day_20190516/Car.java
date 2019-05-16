package Day_20190516;

public class Car {
	/*
	 * 1. 색, 속도를 담을 수 있는 필드
	 * 2. 속도 증가 처리용 메소드 (단순 덧셈만)
	 * 3. 속도 감소 처리용 메소드 (단순 뺄셈만)
	 */
//	protected String color;
//	protected int speed=200;
//	
//	
//	void speedUp() {
//		speed+=10;
//	}
//	void speedDw() {
//		speed-=10;
//	}
	
	int speed;
	String color;
	//생성자
	Car(int speed, String color){
		this.speed = speed;
		this.color = color;
	}
	//메소드
	void speedUp(int speed) {
		this.speed += speed;
	}
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
}
