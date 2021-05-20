package com.pluralsight.observer.ex2;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
