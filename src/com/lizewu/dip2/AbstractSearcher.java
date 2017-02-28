package com.lizewu.dip2;

import com.lizewu.dip2.IPrettyGril;

public abstract class AbstractSearcher {
	
	protected IPrettyGril prettyGril;
	
	public AbstractSearcher(IPrettyGril _prettyGril) {
		// TODO Auto-generated method stub
		this.prettyGril = _prettyGril;
	}
	
	public abstract void show();
	
}
