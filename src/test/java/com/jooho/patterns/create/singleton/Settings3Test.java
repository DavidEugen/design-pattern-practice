package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings3Test {

	@Test
	@DisplayName("SingleTone 기본 형태")
	void singleton_basic() {
		//given
		Settings3 setting = Settings3.getInstance();

		//when
		Settings3 otherSetting = Settings3.getInstance();

		//then
		assertThat(setting).isEqualTo(otherSetting);
	}

}
