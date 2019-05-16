package Day_190516;

import Day_20190516.A1;//A클래스의 패키지를 불러오기 위한 선언

public class D1 extends A1{
	
//	 * 3-1. A클래스의 생성자 호출
//	 * 3-2. A클래스의 필드값 주기
//	 * 3-3. A클래스의 메소드 호출
	//생성자 선언
	public D1(){
		//부모 클래스인 A클래스가 가지고있는 생성자 호출
		super();
		//부모가 가지고 있는 필드, 메소드 호출
		this.field = "응가마려";
		this.method();
	}
}
