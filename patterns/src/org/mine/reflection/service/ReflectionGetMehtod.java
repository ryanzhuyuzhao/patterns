package src.org.mine.reflection.service;

import java.lang.reflect.Method;

/**
 * @filename ReflectionGetMehtod
 * @description 获取成员方法并调用
 * @author朱愈曌
 * @date 2021/3/22 15:01
 */
public class ReflectionGetMehtod {

	public static void main(String[] args) throws Exception {
		/**
		 * 获取成员方法并调用：
		 * 1.批量的：
		 * 		public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
		 * 		public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
		 * 2.获取单个的：
		 * 		public Method getMethod(String name,Class<?>... parameterTypes):
		 * 					参数：
		 * 						name : 方法名；
		 * 						Class ... : 形参的Class类型对象
		 * 		public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
		 *
		 * 	 调用方法：
		 * 		Method --> public Object invoke(Object obj,Object... args):
		 * 		参数说明：
		 * 		obj : 要调用方法的对象；
		 */
		//1.获取Class对象
		Class clazz = Class.forName("src.org.mine.reflection.model.StudentMethod");
		//获取所有公有方法
		System.out.println("***************获取所有的”公有“方法*******************");
		Method[] methodArray = clazz.getMethods();
		for (Method m : methodArray) {
			System.out.println(m);
		}
		System.out.println("***************获取所有的方法，包括私有的*******************");
		methodArray = clazz.getDeclaredMethods();
		for (Method m : methodArray) {
			System.out.println(m);
		}
		System.out.println("***************获取公有的show1()方法*******************");
		Method method = clazz.getMethod("show1", String.class);
		System.out.println(method);
		//实例化一个StudentMethod对象
		Object obj = clazz.getConstructor().newInstance();
		method.invoke(obj, "张三强");
		System.out.println("***************获取私有的show4()方法******************");
		method = clazz.getDeclaredMethod("show4", int.class);
		System.out.println(method);
		method.setAccessible(true);//解除私有设定
		Object result = method.invoke(obj, 25);//需要有两个参数，一个是调用的对象（获取反射），一个是实参
		System.out.println("返回值：" + result);

	}
}
