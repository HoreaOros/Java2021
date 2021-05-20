package com.pluralsight.composite.ex2;


public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString(int level) {
		return print(this, level);
	}
}
