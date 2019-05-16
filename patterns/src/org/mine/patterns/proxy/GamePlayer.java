package org.mine.patterns.proxy;

/**
 * @filename GamePlayer
 * @description
 * @author朱愈曌
 * @date 2019/5/16 11:21
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String username, String password) {
		System.out.println("登录名为 " + username + " 进入游戏," + name + " 登录成功！");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + " 击杀了Boss！");
	}

	@Override
	public void upGrade() {
		System.out.println(this.name + "升级了！");
	}
}
