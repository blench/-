package com.lizewu.template;

public class Hummer1Model extends HummerModel {
	private boolean alarmFlag = true;
	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("悍马1发动...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("悍马1停止...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("悍马1鸣笛...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("悍马1的引擎声音是这样的...");
	}

	
	
	/*public void run() {
		// TODO Auto-generated method stub
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}*/
	protected boolean isAlarm()
	{
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm)
	{
		this.alarmFlag = isAlarm;
	}
}
