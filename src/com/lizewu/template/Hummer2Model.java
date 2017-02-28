package com.lizewu.template;

public class Hummer2Model extends HummerModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("悍马2发动...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("悍马2停止...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("悍马2鸣笛...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("悍马2的引擎声音是这样的...");
	}
	
	
	/*public void run() {
		// TODO Auto-generated method stub
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}*/
	
	//默认是没有喇叭的
	protected boolean isAlarm()
	{
		return false;
	}
}
