package com.lizewu.dip2;

public class Pretty implements IPrettyGril {
	
	private String name;
	public Pretty(String _name) {
		this.name = _name;
	}

	@Override
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"的脸蛋很漂亮！");
	}

	@Override
	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"的身材很好！");
	}

	@Override
	public void greateTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"的气质很好！");
	}

}
