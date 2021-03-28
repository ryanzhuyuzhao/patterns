package org.mine.patterns.adapter.old;

/**
 * @filename Adapter
 * @description 适配器
 * @author朱愈曌
 * @date 2019/5/17 15:23
 *
 * 适配器模式涉及3个角色：
 * 源（Adaptee）：需要被适配的对象或类型，相当于插头
 * 适配器（Adapter）：连接目标和源的中间对象，相当于插头转换器
 * 目标（Target）：期待得到的目标，相当于插座
 *
 * 适配器模式包括3中形式：类适配器模式、对象适配器模式、接口适配器模式（或又称作缺省适配器模式）
 *
 * 类适配器与对象适配器的区别：
 * 类适配器使用的是继承的方式，直接继承了Adaptee，所以无法对Adaptee的子类进行适配
 * 对象适配器使用的是组合的方式，所以Adaptee及其子孙类都可以被适配。另外，对象适配器对于增加一些
 * 新行为非常方便，而且新增加的行为同时适用于所有的源。
 * 基于组合/聚合优于继承的原则，使用对象适配器是更好的选择。但具体问题应该具体分析
 *
 * 适配器的优缺点：
 * 优点：
 * 更好的复用性：系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器模式就可以让这些功能
 * 得到更好的复用。
 * 更好的扩展性：在实现适配器功能的时候，可以扩展自己源的行为（增加方法），从而自然地扩展系统的功能。
 * 缺点：
 * 会导致系统紊乱：滥用适配器，会让系统变得非常零乱。例如，明明看到调用的是A接口，其实内部被适配成了B接口的实现
 * ，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
 */
public class Adapter  extends Adaptee implements Target{
	@Override
	public void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
	}
}
