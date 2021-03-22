package src.org.mine.reflection.service;

import src.org.mine.reflection.model.Student;

/**
 * @filename ReflectionGetClass 参考地址：https://blog.csdn.net/a745233700/article/details/82893076
 * @description
 * @author朱愈曌
 * @date 2021/3/22 10:44
 */
public class ReflectionGetClass {

	public static void main(String[] args) {
		/**获得Class的三种方式
		 * （1）Object-->getClass
		 * （2）任何数据类型（包括基本的数据类型）都有一个“静态”的class属性
		 * （3）通过class的静态方法：forName(String className)（最常用）
		 */
		//第一种方式获得Class对象
		Student stu1 = new Student();//这里的new产生一个Student对象，一个Class对象
		Class stuClass = stu1.getClass();//获取Class对象
		System.out.println(stuClass.getName());

		//第二种方式获得Class对象
		Class stuClass2 = Student.class;
		System.out.println(stuClass2 == stuClass);//判断第一种方式获得的Class对象是否和第二种获取的是否是同一个

		//第三种方式获得Class对象
		try {
			Class stuClass3 = Class.forName("src.org.mine.reflection.model.Student");//全路径名称
			System.out.println(stuClass2 == stuClass3);//判断第二种方式和第三种方式获取的对象是否是同一个
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
