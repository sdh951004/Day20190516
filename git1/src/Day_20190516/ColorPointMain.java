package Day_20190516;

public class ColorPointMain {

	public static void main(String[] args) {
		//A. Point 클래스 객체로 만들어서 set, showPoint 메소드 호출
		Point cpm=new Point();
		cpm.set(1, 1);
		cpm.showPoint();
		//B. ColorPoint 클래스 객체로 만들어서 set, setColor,showColorPoint메소드 호출
		ColorPoint cpm1=new ColorPoint();
		cpm1.set(1, 3);
		cpm1.setColor("빨간색");
		cpm1.showColorPoint();
	}

}
