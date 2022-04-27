package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
