package com.pluralsight.bridge.shape1;
// varianta asta duce la o explozie de clase mai atunci cand trebuie adaugate noi culori dar mai ales atunci
// cand trebuie adaugate noi forme geometrice

// implementare fara bridge
public class Shape1BridgeDemo {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}

}
