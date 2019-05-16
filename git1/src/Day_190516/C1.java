package Day_190516;

import Day_20190516.A1;	//A클래스의 패키지를 불러오기 위한 선언

public class C1{
	/* * 4. C클래스안에 메소드 하나 선언해서 그 안에
	 * 4-1. A클래스 객체로 선언
	 * 4-2. A클래스의 필드값 주기
	 * 4.3. A클래스의 메소드 호출*/
	

	public void method() {
		A1 c=new A1();	//다른 패키지의 A클래스 생성자를 protected로 선언해서
		c.field = "응가마려";	//protected로 선언되어서 안됨.
		c.method(); //protected로 선언되어서 안됨.
	}
}