package Day_20190516;

public class Car {
	/*
	 * 1. ��, �ӵ��� ���� �� �ִ� �ʵ�
	 * 2. �ӵ� ���� ó���� �޼ҵ� (�ܼ� ������)
	 * 3. �ӵ� ���� ó���� �޼ҵ� (�ܼ� ������)
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
	//������
	Car(int speed, String color){
		this.speed = speed;
		this.color = color;
	}
	//�޼ҵ�
	void speedUp(int speed) {
		this.speed += speed;
	}
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
}
