package Day_20190516;

public class BookingTicket extends Ticket {
/*
 * Ticket ���
 * �������� Ƽ��. Ƽ�� ��ȣ�� �������� �ϼ� ������ ����������
 * ���� ���Ÿ� �ߴ��Ŀ� ���� ������ �޶���.
 * -30�� ��: 50%����
 * -10�� ��: 20%����
 * -5�� ��: 10%����
 */
	BookingTicket(){
		this.Tnum=Tnum;
		this.Tprice=Tprice;
		this.date=date;
	}
	
	void dates(int date) {
		if(date<5) {
			Tprice=Tprice-(Tprice*10/100);
			TpriceChange();
		//System.out.println("���� :"+Tprice);
		}
		else if(date<10) {
			Tprice=Tprice-(Tprice*20/100);
			TpriceChange();
		//	System.out.println("���� :"+Tprice);
			
		}
		else if(date<30) {
			Tprice=Tprice-(Tprice*50/100);
			TpriceChange();
		//	System.out.println("���� :"+Tprice);
	}
	
}
}
