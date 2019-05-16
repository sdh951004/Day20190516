package Day_20190516;

public class NormalTicket extends Ticket{
	
	/*
	 * Ticket 상속
	 * 일반 티켓. 티켓이 발행될 떄 티켓번호와 신용카드결제 여부 정보를 가지고 있음.
	 * 신용카드로 결제하는 경우 5% 금액이 가산됨.
	 */
	String card;
	NormalTicket(){
		
	}
	NormalTicket(String card,int date){
		this.date=date;
		this.Tnum=Tnum;
		this.Tprice=Tprice;
		this.card=card;
	}
	
	void Card() {
		if(card=="신용") {
			Tprice=Tprice-(Tprice*5/100);
		}
		else {
			
		}
	}

	
}
