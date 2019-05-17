package org.mine.patterns.wrapper;

/**
 * @filename FilterCook
 * @description 定义一个装饰器角色，具体的工作具体装饰器去实现
 * @author朱愈曌
 * @date 2019/5/17 17:01
 *
 * 装饰器模式以对客户端透明的方式动态地给一个对象附加上了更多的责任。换言之，客户端并不会角色对象在装饰前和装饰后有什么
 * 不同。装饰器模式可以再不用创建更多子类的情况下，将对象的功能加以扩展
 *
 * 装饰器模式中的角色有：
 * 1.抽象构建角色
 * 给出一个抽象接口，以规范准备接受附加责任的对象
 * 2.具体构建角色
 * 定义一个将要接受附加责任的类
 * 3.装饰角色
 * 持有一个构建对象的实例，并定义一个抽象构件接口一致的接口
 * 4.具体装饰角色
 * 负责给构建对象贴上附加的责任
 *
 */
public abstract class FilterCook implements Cook{
	protected Cook cook;
}
