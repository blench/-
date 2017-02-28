package com.lizewu.proxy;

public class GamePlayer implements IGamePlayer {
	
	private String name = "";
	//我的代理是谁
	private IGamePlayer proxy = null;
	public GamePlayer(String _name)
	{
		this.name = _name;
	}
	
	/**
	 * 普通代理模式
	 * @param _player
	 * @param _name
	 * @throws Exception
	 */
	public GamePlayer(IGamePlayer _player,String _name) throws Exception
	{
		if(_player == null)
		{
			throw new Exception("不能创建真实角色");
		}else{
			this.name = _name;
		}
		
	}
	
	/**
	 * 
	 * 使用强制代理模式
	 */
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		if(this.isProxy())
		{
			System.out.println("登录名为"+user+"的用户"+this.name+"登录成功!");
		}else{
			System.out.println("请使用指定的代理访问");
		}
		
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		if(this.isProxy())
		{
			System.out.println(this.name+"在打怪!");
		}else{
			System.out.println("请使用指定的代理访问");
		}
		
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		if(this.isProxy())
		{
			System.out.println(this.name+"又升了一级!");
		}else{
			System.out.println("请使用指定的代理访问");
		}
		
	}
	
	
	//找到自己的代理
	
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	private boolean isProxy()
	{	
		return true;
		/*
		if(this.proxy == null)
		{
			return false;
		}else{
			return true;
		}*/
	}
}
