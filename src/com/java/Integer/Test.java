package com.java.Integer;

/**
 * java Integer�Ļ������
 * �� Java 5 �У�Ϊ Integer �Ĳ���������һ���µ����ԣ�������ʡ�ڴ��������ܡ�
 * ���Ͷ������ڲ�ʵ����ͨ��ʹ����ͬ�Ķ�������ʵ���˻�������á�����Ĺ����������������� -128 �� +127��
 * ���� Integer ������Խ����Զ�װ�䣨autoboxing����ʱ�����ã�ʹ�ù����������� Integer �����ܱ�����
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer t1=1;
		Integer t2=1;
		String s=(t1==t2)?"true":"false";
		System.out.println("t1==t2:"+s);
		Integer t3=129;
		Integer t4=129;
		String z=(t3==t4)?"true":"false";
		System.out.println("t3==t4:"+z);
		Integer t5=new Integer(127);
		Integer t6=127;
		String q=(t5==t6)?"true":"false";
		System.out.println("t5==t6:"+q);
		Integer t7=-128;
		Integer t8=-128;
		String w=(t7==t8)?"true":"false";
		System.out.println("t7==t8:"+w);
	}

}
