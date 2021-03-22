package src.org.mine.reflection.service;

import java.lang.reflect.Field;

import src.org.mine.reflection.model.StudentField;

/**
 * @filename ReflectionGetField
 * @description 获取成员变量并调用
 * @author朱愈曌
 * @date 2021/3/22 11:35
 */
public class ReflectionGetField {

	public static void main(String[] args) throws Exception {
		/**
		 * 获取成员变量并调用：
		 * 1.批量的
		 * 	1).Field[] getFields():获取所有的"公有字段"
		 * 	2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
		 * 2.获取单个的
		 * 	1).public Field getField(String fieldName):获取某个"公有的"字段；
		 * 	2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
		 * 3.设置字段的值
		 * 	Field --> public void set(Object obj,Object value)
		 * 	参数说明：
		 * 		1.obj:要设置的字段所在的对象；
		 * 		2.value:要为字段设置的值；
		 */
		//1.获取Class对象
		Class clazz = Class.forName("src.org.mine.reflection.model.StudentField");
		//2.获取字段
		System.out.println("************获取所有公有的字段********************");
		Field[] fieldArray = clazz.getFields();
		for (Field field : fieldArray) {
			System.out.println(field);
		}
		System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
		fieldArray = clazz.getDeclaredFields();
		for (Field field : fieldArray) {
			System.out.println(field);
		}
		System.out.println("*************获取公有字段**并调用***********************************");
		Field field = clazz.getField("name");
		System.out.println(field);
		//获取一个对象
		Object obj = clazz.getConstructor().newInstance();//产生Student对象--》StudentField stf = new StudentField();
		field.set(obj, "张三强");
		//验证
		StudentField stf = (StudentField) obj;
		System.out.println("验证姓名：" + stf.name);
		System.out.println("**************获取私有字段****并调用********************************");
		field = clazz.getDeclaredField("phoneNum");
		System.out.println(field);
		field.setAccessible(true);//暴力反射，解除私有设定
		field.set(obj, "18510235689");
		System.out.println("验证电话：" + stf);

	}
}
