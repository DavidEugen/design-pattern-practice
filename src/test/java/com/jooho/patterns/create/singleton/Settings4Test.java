package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties.Settings;

class Settings4Test {

	@Test
	@DisplayName("SingleTone 홀더 형태")
	void singleton_basic() {
		//given
		Settings4 setting = Settings4.getInstance();

		//when
		Settings4 otherSetting = Settings4.getInstance();

		//then
		assertThat(setting).isEqualTo(otherSetting);
	}

	@Test
	@DisplayName("리플렉션을 이용하면 singleton 깨질 수 있다.")
	void reflection_crack()
		throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		//given
		Settings4 settings = Settings4.getInstance();

		//when
		Constructor<Settings4> declaredConstructor = Settings4.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		Settings4 otherSettings = declaredConstructor.newInstance();

		//then
		assertThat(settings).isNotEqualTo(otherSettings);
	}


	@Test
	@DisplayName("역 직렬화를 이용하면 singleton 깨질 수 있다.")
	void deseiralize_crack() throws IOException, ClassNotFoundException {
		///given
		Settings4s settings = Settings4s.getInstance();//클래스가 직렬화 가능하다면

		//when
		Settings4s otherSettings = null;
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings4s.obj"))) {
			out.writeObject(settings);
		}
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings4s.obj"))) {
			otherSettings = (Settings4s) in.readObject();
		}

		//then
		assertThat(settings).isNotEqualTo(otherSettings);
	}

}
