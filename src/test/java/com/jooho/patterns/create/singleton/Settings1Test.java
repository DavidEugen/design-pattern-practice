package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings1Test {

	@Test
	@DisplayName("SingleTone 기본 형태")
	void singleton_basic() {
		//given
		Settings1 setting = Settings1.getInstance();

		//when
		Settings1 otherSetting = Settings1.getInstance();

		//then
		assertThat(setting).isEqualTo(otherSetting);
	}

}
