package com.lizewu.prototypepattern;

/**
 * 修改后的Mail类必须继承Cloneable
 * @author lizewu
 *
 */
public class Mail implements Cloneable {
	private String receiver;
	private String subject;
	private String application;
	private String context;
	private String tail;
	
	
	public Mail(AdvTemplate advTemplate) {
		
		this.subject = advTemplate.getAdvSubject();
		this.context = advTemplate.getAdvContext();
	
	}
	
	@Override
	public Mail clone() {
		// TODO Auto-generated method stub
		Mail mail = null;
		try{
			mail = (Mail)super.clone();
		}catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return mail;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
}
