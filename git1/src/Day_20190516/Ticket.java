package Day_20190516;

public class Ticket {
	/*
	 * 각 티켓은 티켓 번호화 가격 정보를 가지고 있음.
	 * 티켓의 가격은 변경 가능함.
	 */
	int date;
	String Tnum;
	int Tprice;
	Ticket(){
		
	}
	
	Ticket(int Tprice){
		
		this.Tnum=Tnum;
		this.Tprice=Tprice;
		
	}
	
	void TpriceChange() {
		this.Tprice=Tprice;
	}

	public String getTnum() {
		return Tnum;
	}

	public void setTnum(String tnum) {
		Tnum = tnum;
	}
	
	
}
