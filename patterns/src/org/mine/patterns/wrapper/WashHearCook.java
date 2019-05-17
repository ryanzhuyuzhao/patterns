package org.mine.patterns.wrapper;

/**
 * @filename WashHearCook
 * @description 定义具体装饰角色
 * @author朱愈曌
 * @date 2019/5/17 17:13
 */
public class WashHearCook extends FilterCook {
	public WashHearCook(Cook cook) {
		this.cook = cook;
	}

	@Override
	public void cookDinner() {
		System.out.println("先洗头");
		cook.cookDinner();
	}
}
