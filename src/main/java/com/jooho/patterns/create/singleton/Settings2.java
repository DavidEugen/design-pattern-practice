package com.jooho.patterns.create.singleton;

public class Settings2 {
	//	private static Settings2 instance;
	private static final Settings2 INSTANCE = new Settings2();

	private Settings2() {
	}

//	public static synchronized Settings2 getInstance() {
//		if (instance == null) {
//			instance = new Settings2();
//		}
//
//		return instance;
//	}

	public static Settings2 getInstance() {
		return INSTANCE;
	}
}
