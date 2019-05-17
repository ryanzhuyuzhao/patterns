package org.mine.patterns.wrapper;

/**
 * @filename TestWrapper
 * @description 测试类
 * @author朱愈曌
 * @date 2019/5/17 17:15
 */
public class TestWrapper  {
	public static void main(String[] args) {
		Cook cook0 = new WashHandsCook(new ChineseCook());
		Cook cook1 = new WashHearCook(new ChineseCook());
		cook0.cookDinner();
		cook1.cookDinner();
	}
}
