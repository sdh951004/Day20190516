package Day_20190516;

public class Sedan extends Car {
	/*
	 * 1. �¼����� ���� �� �ִ� �ʵ�
	 * 2. �¼����� return���ִ� �޼ҵ�
	 */
//	public static final String red="����";
//	public static final String black="����";
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
//		if(color=="����") {
//			System.out.println(color+"�¿����� �ӵ���"+speed+"�̰� �¼�����"+sit+"�� �Դϴ�.");
//		}
//		else {
//			System.out.println(color+"�¿����� �ӵ���"+speed+"�̰� �¼�����"+sit+"�� �Դϴ�.");
//		}
//	}//
	//�ʵ� ����
	private int seatNum;
	//������ ����
	Sedan(int speed, String color){
		super(speed,color);
		
	}
	//�޼ҵ� ����
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	
}
