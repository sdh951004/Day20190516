package Day_20190516;

public class Truck extends Car{
/*
 * 1.���緮�� ���� �� �ִ� �ʵ�
 * 2.���緮 return���ִ� �޼ҵ�
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
//		if(color=="����") {
//			System.out.println(color+"Ʈ���� �ӵ���"+speed+"�̰� ���緮��"+gram+"�� �Դϴ�.");
//		}
//		else {
//			System.out.println(color+"Ʈ���� �ӵ���"+speed+"�̰� ���緮��"+gram+"�� �Դϴ�.");
//		}
//	}
	//���緮 �ʵ弱��
	private int capacity;
	Truck(int speed, String color, int capacity){
		super(speed,color);
		this.capacity=capacity;
	}
	int getCapacity() {
		return capacity;
	}
}
