package Day_20190516;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 1. ������ �¿����� �ӵ��� 200�̰� �¼����� 5�� �Դϴ�.
		 * 2.������ Ʈ���� �ӵ��� 100�̰�, ���緮�� 5���Դϴ�.
		 */
//		Sedan car=new Sedan(5);
//		car.speed=200;
//		car.color="����";
//		car.Cars();
//		System.out.println("-----------------------------");
//		Truck Tcar=new Truck(5);
//		Tcar.color="����";
//		Tcar.speed=100;
//		Tcar.Tcars();
//		
		//SedanŬ������ ��ü ����
		Sedan sedan=new Sedan(100,"������");
		//TruckŬ������ ��ü ����
		Truck truck=new Truck(70,"����",5);
		//�ӵ� ���� �޼ҵ� ȣ��
		sedan.speedUp(15);
		truck.speedUp(10);
		
		//SedanŬ������ seatNum �ʵ尪 ����
		sedan.setSeatNum(5);	 //getter setter ��� �̿��ؼ� ������.
		//��¹� �ۼ�
		System.out.println(sedan.color+"�¿��� �ӵ��� "+sedan.speed+"�̰� �¼����� "+sedan.getSeatNum()+"�� �Դϴ�.");
		System.out.println(truck.color+"Ʈ�� �ӵ��� "+truck.speed+"�̰� ���緮�� "+truck.getCapacity()+"�� �Դϴ�.");
	}

}
