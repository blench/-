package com.lizewu.factory2;


public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		// TODO Auto-generated method stub
		
		//定义一个生产的人种
		Human human = null;
		try{
			human = (T)Class.forName(c.getName()).newInstance();
		}catch(Exception e)
		{
			System.out.println("创建人种失败");
		}		
		return (T)human;
	}

}
