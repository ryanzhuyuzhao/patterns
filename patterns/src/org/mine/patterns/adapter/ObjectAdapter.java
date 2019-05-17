package org.mine.patterns.adapter;

/**
 * @filename ObjectAdapter
 * @description 对象适配器
 * @author朱愈曌
 * @date 2019/5/17 15:34
 */
public class ObjectAdapter implements Target {
	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void method1() {
		adaptee.method1();
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		ObjectAdapter adapter = new ObjectAdapter(new Adaptee());
		adapter.method1();
		adapter.method2();
	}
}
