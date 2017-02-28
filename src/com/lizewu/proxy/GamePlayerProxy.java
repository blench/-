package com.lizewu.proxy;

public class GamePlayerProxy implements IGamePlayer,IProxy{
	
	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer _gamePlayer)
	{
		this.gamePlayer = _gamePlayer;
	}
	
	//普通代理
	public GamePlayerProxy(String _name)
	{
		try{
			gamePlayer = new GamePlayer(this,_name);
		}catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
		/**
		 * 这里实现了IProxy接口 
		 */
		this.count();
	}
	
	
	//代理的代理暂时还没有，就是自己
	
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println("升级总费用是:150元");
	}

}
