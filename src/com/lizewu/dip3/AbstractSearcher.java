package com.lizewu.dip3;


public abstract class AbstractSearcher {
	
	protected IGoodBodyGril goodBodyGril;
	protected IGreateTemperamentGril greateTemperamentGril;
	public AbstractSearcher(IGoodBodyGril _goodBodyGril) {
		// TODO Auto-generated method stub
		this.goodBodyGril = _goodBodyGril;
	}
	
	public AbstractSearcher(IGreateTemperamentGril _greateTemperamentGril) {
		// TODO Auto-generated constructor stub
		this.greateTemperamentGril = _greateTemperamentGril;
	}
	
	public abstract void show();
	
}
