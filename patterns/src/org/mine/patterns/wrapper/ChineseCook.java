package org.mine.patterns.wrapper;

/**
 * @filename ChineseCook
 * @description 具体构建角色，中国厨师
 * @author朱愈曌
 * @date 2019/5/17 17:00
 */
public class ChineseCook implements Cook {
	@Override
	public void cookDinner() {
		System.out.println("中国人做晚饭");
	}
}
