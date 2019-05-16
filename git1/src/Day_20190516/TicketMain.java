package Day_20190516;

public class TicketMain {

	public static void main(String[] args) {
		/*
		 * 사전예약 티켓, 일반 예매 티켓을 각각 객체로 만들어서 각 티켓의 티켓번호, 구매가격을 출력하시오.
		 */
		BookingTicket ticket = new BookingTicket();
		ticket.Tnum="20190516";
		ticket.getTnum();
		ticket.Tprice=30000;
		System.out.println("원 가 :"+ticket.Tprice);
		ticket.dates(8);
		//ticket.TpriceChange();
		System.out.println("티켓 정보:"+ticket.Tnum+"구매 가격:"+ticket.Tprice);
		NormalTicket ticket1 = new NormalTicket();
		ticket1.Tnum="20190516";
		ticket1.Tprice=30000;
		System.out.println("원 가 :"+ticket1.Tprice);
		ticket1.date=20;
		ticket1.card="신용";
		ticket1.TpriceChange();
		System.out.println("티켓정보 :"+ticket1.Tnum+"구매 가격:"+ticket1.Tprice);
		
		
	}

}
