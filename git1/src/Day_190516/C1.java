package Day_190516;

import Day_20190516.A1;	//AŬ������ ��Ű���� �ҷ����� ���� ����

public class C1{
	/* * 4. CŬ�����ȿ� �޼ҵ� �ϳ� �����ؼ� �� �ȿ�
	 * 4-1. AŬ���� ��ü�� ����
	 * 4-2. AŬ������ �ʵ尪 �ֱ�
	 * 4.3. AŬ������ �޼ҵ� ȣ��*/
	

	public void method() {
		A1 c=new A1();	//�ٸ� ��Ű���� AŬ���� �����ڸ� protected�� �����ؼ�
		c.field = "��������";	//protected�� ����Ǿ �ȵ�.
		c.method(); //protected�� ����Ǿ �ȵ�.
	}
}