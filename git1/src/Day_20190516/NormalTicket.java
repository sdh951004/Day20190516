package Day_20190516;

public class NormalTicket extends Ticket{
	
	/*
	 * Ticket ���
	 * �Ϲ� Ƽ��. Ƽ���� ����� �� Ƽ�Ϲ�ȣ�� �ſ�ī����� ���� ������ ������ ����.
	 * �ſ�ī��� �����ϴ� ��� 5% �ݾ��� �����.
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
		if(card=="�ſ�") {
			Tprice=Tprice-(Tprice*5/100);
		}
		else {
			
		}
	}

	
}
