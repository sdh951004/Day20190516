package Day_20190516;

public class BookingTicket extends Ticket {
/*
 * Ticket 상속
 * 사전예약 티켓. 티켓 번호와 사전예약 일수 정보를 가지고있음
 * 언제 예매를 했느냐에 따라 가격이 달라짐.
 * -30일 전: 50%할인
 * -10일 전: 20%할인
 * -5일 전: 10%할인
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
		//System.out.println("가격 :"+Tprice);
		}
		else if(date<10) {
			Tprice=Tprice-(Tprice*20/100);
			TpriceChange();
		//	System.out.println("가격 :"+Tprice);
			
		}
		else if(date<30) {
			Tprice=Tprice-(Tprice*50/100);
			TpriceChange();
		//	System.out.println("가격 :"+Tprice);
	}
	
}
}
