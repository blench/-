package com.lizewu.command;

public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.rg.find();
		super.rg.add();
		super.pg.add();
		super.cg.add();
		super.rg.plan();
	}

}
