package org.mine.patterns.wrapper;

/**
 * @filename WashHandsCook
 * @description 定义具体装饰角色
 * @author朱愈曌
 * @date 2019/5/17 17:12
 */
public class WashHandsCook extends FilterCook {
	public WashHandsCook(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void cookDinner() {
		System.out.println("先洗手");
		cook.cookDinner();
	}
}
