package Day_20190516;

public class TicketMain {

	public static void main(String[] args) {
		/*
		 * �������� Ƽ��, �Ϲ� ���� Ƽ���� ���� ��ü�� ���� �� Ƽ���� Ƽ�Ϲ�ȣ, ���Ű����� ����Ͻÿ�.
		 */
		BookingTicket ticket = new BookingTicket();
		ticket.Tnum="20190516";
		ticket.getTnum();
		ticket.Tprice=30000;
		System.out.println("�� �� :"+ticket.Tprice);
		ticket.dates(8);
		//ticket.TpriceChange();
		System.out.println("Ƽ�� ����:"+ticket.Tnum+"���� ����:"+ticket.Tprice);
		NormalTicket ticket1 = new NormalTicket();
		ticket1.Tnum="20190516";
		ticket1.Tprice=30000;
		System.out.println("�� �� :"+ticket1.Tprice);
		ticket1.date=20;
		ticket1.card="�ſ�";
		ticket1.TpriceChange();
		System.out.println("Ƽ������ :"+ticket1.Tnum+"���� ����:"+ticket1.Tprice);
		
		
	}

}
