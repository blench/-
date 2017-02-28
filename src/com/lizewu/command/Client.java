package com.lizewu.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("------客户要求删除一个页面-------");
//		Group gp = new PageGroup();
//		gp.find();
//		gp.delete();
//		gp.plan();
		//定义我们的接头人
		Invoker xiaosan = new Invoker();
		System.out.println("------客户要求增加一项需求--------");
		Command command = new AddRequirementCommand();
//		Command command = new DeletePageCommand();
		xiaosan.setCommand(command);
		xiaosan.action();
	}

}
