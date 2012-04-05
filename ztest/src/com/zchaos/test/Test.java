package com.zchaos.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("HHmmss");
		System.out.println(format.format(new Date()));
	}
}
