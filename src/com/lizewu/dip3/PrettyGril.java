package com.lizewu.dip3;

public class PrettyGril implements IGoodBodyGril, IGreateTemperamentGril {
	
	private String name;
	
	public PrettyGril(String _name)
	{
		this.name = _name;
	}
	@Override
	public void greateTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"气质非常好!");
	}

	@Override
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"脸蛋非常漂亮!");
	}

	@Override
	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"身材要非常棒!");
	}

}
