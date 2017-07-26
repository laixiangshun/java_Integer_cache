package com.java.Integer;

/**
 * java Integer的缓存策略
 * 在 Java 5 中，为 Integer 的操作引入了一个新的特性，用来节省内存和提高性能。
 * 整型对象在内部实现中通过使用相同的对象引用实现了缓存和重用。上面的规则适用于整数区间 -128 到 +127。
 * 这种 Integer 缓存策略仅在自动装箱（autoboxing）的时候有用，使用构造器创建的 Integer 对象不能被缓存
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
