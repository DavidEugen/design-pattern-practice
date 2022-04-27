package com.jooho.patterns.create.singleton;

import java.io.Serializable;

public class Settings4s implements Serializable {
	private Settings4s() { }

	private static class Settings4Holder {
		private static final Settings4s INSTANCE = new Settings4s();
	}

	public static Settings4s getInstance() {
		return Settings4Holder.INSTANCE;
	}

}
