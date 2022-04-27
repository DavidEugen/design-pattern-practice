package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings5Test {

	@Test
	@DisplayName("SingleTone 홀더 형태")
	void singleton_basic() {
		//given
		Settings5 setting = Settings5.INSTANCE;

		//when
		Settings5 otherSetting = Settings5.INSTANCE;

		//then
		assertThat(setting).isEqualTo(otherSetting);
	}
}
