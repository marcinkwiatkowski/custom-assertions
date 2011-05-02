package com.passionatedeveloper.tests.hamcrest;

import static com.passionatedeveloper.tests.hamcrest.Contains.contains;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.passionatedeveloper.tests.Range;

public class CustomHamcrest {

	@Test
	public void containsIntegersWithinRange() {
		Range range = new Range(1, 3);

		assertThat(range, contains(1, 2, 3));
		assertThat(range, not(contains(4)));
	}

	@Test
	public void failure() {
		Range range = new Range(1, 3);

		assertThat(range, contains(4));
	}

}
