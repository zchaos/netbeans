package com.zchaos.test.observable;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("name:" + arg);
	}

}
