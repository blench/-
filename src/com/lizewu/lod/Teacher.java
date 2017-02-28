package com.lizewu.lod;
/**
 * 迪米特法则用于实现类之间耦合度的降低
 * 朋友类的定义出现在成员变量、方法的输入与输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于成员类
 * @author lizewu
 *
 */
public class Teacher {
	
	//老师对体育委员发布命令，清点一下女生人数
	public void command (GroupLeader leader)
	{
		leader.count();
	}
}
