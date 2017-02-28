package com.lizewu.builder;

import java.util.ArrayList;
/**
 * 建造者模式
 * @author lizewu
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BenzModel benz = new BenzModel();
	
		/*ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		
		BenzBuilder benzBuilder = new  BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
		
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();*/
		
		Director director = new Director();
		for(int i=0;i<10000;i++)
		{
			director.getABenzModel().run();
		}
		
		for(int i=0;i<10000;i++)
		{
			director.getBBenzModel().run();
		}
		
		for(int i=0;i<10000;i++)
		{
			director.getCBMWModel().run();
		}
	}

}
