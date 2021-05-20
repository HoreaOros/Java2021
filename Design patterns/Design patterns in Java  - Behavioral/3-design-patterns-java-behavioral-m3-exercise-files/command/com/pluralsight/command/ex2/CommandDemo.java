package com.pluralsight.command.ex2;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String args[]) {
		Light bedroomLight = new Light(); // receiver
		Light kitchenLight = new Light(); // receiver
		Switch lightSwitch = new Switch(); // invoker
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
