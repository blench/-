package com.lizewu.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 优点：
 * 封装不变部分，扩展可变部分
 * 提取公共部分代码，便于维护
 * 行为由父类控制，子类实现。
 * 缺点：
 * 
 * @author lizewu
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		HummerModel h1 = new Hummer1Model();
//		h1.run();
		System.out.println("------H1型号悍马-------");
		System.out.println("H1型号的悍马是否需要鸣喇叭？0-不需要      1-需要");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Hummer1Model h1 = new Hummer1Model();
		if(type.equals("0"))
		{
			h1.setAlarm(false);
		}
		h1.run();
		
		System.out.println("\n-----H2型号悍马--------");
		Hummer2Model h2 = new Hummer2Model();
		h2.run();
	}
}
