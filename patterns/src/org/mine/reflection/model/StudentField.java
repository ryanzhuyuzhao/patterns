package src.org.mine.reflection.model;

/**
 * @filename StudentField
 * @description 成员变量调用
 * @author朱愈曌
 * @date 2021/3/22 11:34
 */
public class StudentField {

	public StudentField() {

	}

	//**********字段*************//
	public String name;
	protected int age;
	char sex;
	private String phoneNum;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNum=" + phoneNum + "]";
	}

}
