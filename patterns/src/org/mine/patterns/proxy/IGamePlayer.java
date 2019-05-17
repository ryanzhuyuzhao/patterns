package org.mine.patterns.proxy;

/**
 * @filename IGamePlayer
 * @description 动态代理：就是实现阶段不用关心代理是哪个，而在运行阶段指定具体哪个代理
 * @author朱愈曌
 * @date 2019/5/16 11:12
 */
public interface IGamePlayer {

	/**
	 * 功能描述 登录游戏
	 * @param username
	 * @param password
	 * @return void
	 * @author朱愈曌
	 * @date 2019/5/16 11:15
	 */
	void login(String username, String password);

	/**
	 * 功能描述	击杀Boss
	 * @param
	 * @return void
	 * @author朱愈曌
	 * @date 2019/5/16 11:20
	 */
	void killBoss();

	/**
	 * 功能描述	升级
	 * @param
	 * @return void
	 * @author朱愈曌
	 * @date 2019/5/16 11:21
	 */
	void upGrade();

	void test();
}
