package com.pluralsight.command.ex2;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
