package Day_20190516;

public class ColorPointMain {

	public static void main(String[] args) {
		//A. Point Ŭ���� ��ü�� ���� set, showPoint �޼ҵ� ȣ��
		Point cpm=new Point();
		cpm.set(1, 1);
		cpm.showPoint();
		//B. ColorPoint Ŭ���� ��ü�� ���� set, setColor,showColorPoint�޼ҵ� ȣ��
		ColorPoint cpm1=new ColorPoint();
		cpm1.set(1, 3);
		cpm1.setColor("������");
		cpm1.showColorPoint();
	}

}
