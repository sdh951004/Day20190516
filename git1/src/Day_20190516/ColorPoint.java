package Day_20190516;

public class ColorPoint extends Point {
	//A. String �ʵ� 1�� ����
	private String color;
	//B. setColor �޼ҵ�
	//B-1. 1�� �Ű������� ���޹޾� �ʵ尪���� ������.
	void setColor(String color) {
		this.color=color;
	}
	//C. showColorPoint �޼ҵ�
	//C-1. �ʵ尪 ����ϴ� print��
	//C-2. showPoint �޼ҵ� ȣ����.
	void showColorPoint() {
		System.out.println("itzy�÷�:"+this.color);
		showPoint(); //�θ� ������ �ִ� �޼ҵ� ȣ�� //������ �ϱ� ���� �޼ҵ带 ȣ���Ҷ� super�� ����
	}
	
}
