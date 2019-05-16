package Day_20190516;

public class Point {
	//정수형 필드 선언
	private int x;		
	private int y;			
	
	//set 메소드 선언
	void set(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	//showPoint 메소드 선언
	void showPoint() {
		System.out.println("x 값 : "+this.x);
		System.out.println("y 값 : "+this.y);
	}

	
	/*
	 * //A.정수형 필드를 2개 가짐 int num1; int num2; 
	 * //B.set 메소드 
	 * // B-1. 2개의 매개변수를 전달 받아
	 * 필드값으로 세팅함. 
	 * void set(int num1, int num2) { 
	 * this.num1=num1; this.num2=num2;
	 *  }
	 * 
	 * //C.showPoint메소드 
	 * //C-1. 2개 필드값을 출력하는 print문 있음. 
	 * public void showPoint() {
	 * System.out.println(num1); 
	 * System.out.println(num2); 
	 * }
	 */
	
}
