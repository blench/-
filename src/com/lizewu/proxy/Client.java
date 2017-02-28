package com.lizewu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		//然后再定义一个代练者
		IGamePlayer  proxy= new GamePlayerProxy(player);*/
		//先定义一个代练者
		/*
		 * 普通代理的模式
		 * IGamePlayer proxy = new GamePlayerProxy("张三");
		 * System.out.println("开始时间是:2009-8-25 10:45");
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是:2009-8-26 03:40");
		 * */
		
		
		IGamePlayer player = new GamePlayer("张三");
		//定义一个handler
		InvocationHandler handler = new GamePlayerIH(player);
		
		System.out.println("开始时间是:2009-8-25 10:45");
		//活的类的class loader
		ClassLoader cl = player.getClass().getClassLoader();
		//动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,
				new Class[]{IGamePlayer.class}, handler);
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是:2009-8-26 03:40");
	}

}
