package Day_20190516;

public class ColorPoint extends Point {
	//A. String 필드 1개 가짐
	private String color;
	//B. setColor 메소드
	//B-1. 1개 매개변수를 전달받아 필드값으로 세팅함.
	void setColor(String color) {
		this.color=color;
	}
	//C. showColorPoint 메소드
	//C-1. 필드값 출력하는 print문
	//C-2. showPoint 메소드 호출함.
	void showColorPoint() {
		System.out.println("itzy컬러:"+this.color);
		showPoint(); //부모가 가지고 있는 메소드 호출 //재정의 하기 전에 메소드를 호출할때 super를 쓴다
	}
	
}
