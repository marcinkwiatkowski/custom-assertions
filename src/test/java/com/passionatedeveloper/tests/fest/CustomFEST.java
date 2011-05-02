package com.passionatedeveloper.tests.fest;

import static com.passionatedeveloper.tests.fest.RangeAssert.assertThat;

import org.junit.Test;

import com.passionatedeveloper.tests.Range;

public class CustomFEST {

	@Test
	public void containsIntegersWithinRange() {
		Range range = new Range(1, 3);

		assertThat(range).contains(1, 2, 3);
		assertThat(range).doesNotContain(4);
	}

	@Test
	public void failure() {
		Range range = new Range(1, 3);

		assertThat(range).contains(4);
		assertThat(range).doesNotContain(1, 2, 3);
	}
}
