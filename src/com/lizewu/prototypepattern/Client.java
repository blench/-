package com.lizewu.prototypepattern;

import java.util.Random;

public class Client {
	
	private static int MAX_COUNT = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		int  i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setSubject("XX银行国庆举行活动");
		mail.setTail("XX银行版权所有");
		while(i<MAX_COUNT){
			//修改后的cloneMail
			Mail cloneMail =   mail.clone();
			cloneMail.setApplication(getRandString(5)+"先生(女士)");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail){
		System.out.println("标题:"+mail.getSubject()+"\t收件人:"
				+mail.getReceiver()+"\t...发送成功");
	}
	
	public static String getRandString(int maxLength)
	{
		String source = "abcdefghijklmnopqrstuvwxyABCDEFGHIJKLMNOPQRESTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i=0;i<maxLength;i++)
		{
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
