package Day_20190516;

public class Ticket {
	/*
	 * �� Ƽ���� Ƽ�� ��ȣȭ ���� ������ ������ ����.
	 * Ƽ���� ������ ���� ������.
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
