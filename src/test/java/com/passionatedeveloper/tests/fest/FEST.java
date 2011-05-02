package com.passionatedeveloper.tests.fest;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

import com.passionatedeveloper.tests.Range;

public class FEST {

	@Test
	public void containsIntegersWithinRange() {
		Range range = new Range(1, 3);

		assertThat(range.contains(1)).isTrue();
		assertThat(range.contains(2)).isTrue();
		assertThat(range.contains(3)).isTrue();
		assertThat(range.contains(4)).isFalse();
	}

	@Test
	public void failure() {
		Range range = new Range(1, 3);

		assertThat(range.contains(4)).isTrue();
	}

}
