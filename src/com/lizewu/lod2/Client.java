package com.lizewu.lod2;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard wizard = new Wizard();
		InstallSoftware install = new InstallSoftware();
		
		install.installWizard(wizard);
	}

}
