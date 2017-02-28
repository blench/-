package com.lizewu.template;

public abstract class HummerModel {
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoom();
	
	/**
	 * 模板方法，尽量使用final关键字
	 */
	public final void run()
	{
		this.start();
		
		this.engineBoom();
		
		if(this.isAlarm())
		{
			this.alarm();
		}
		this.stop();
	}
	
	//钩子方法,模板模式的扩展
	protected boolean isAlarm()
	{
		return true;
	}
}
