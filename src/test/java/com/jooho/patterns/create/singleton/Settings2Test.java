package com.jooho.patterns.create.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings2Test {

	@Test
	@DisplayName("SingleTone 기본 형태")
	void singleton_basic() {
		//given
		Settings2 setting = Settings2.getInstance();

		//when
		Settings2 otherSetting = Settings2.getInstance();

		//then
		assertThat(setting).isEqualTo(otherSetting);
	}

	@Test
	@DisplayName("Thread 안정성 테스트")
	void thread_safe() {

	}
}
