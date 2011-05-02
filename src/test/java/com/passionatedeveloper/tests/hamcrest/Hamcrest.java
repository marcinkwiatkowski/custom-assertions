package com.passionatedeveloper.tests.hamcrest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.passionatedeveloper.tests.Range;

public class Hamcrest {

	@Test
	public void containsIntegersWithinRange() {
		Range range = new Range(1, 3);

		assertThat(range.contains(1), is(true));
		assertThat(range.contains(2), is(true));
		assertThat(range.contains(3), is(true));
		assertThat(range.contains(4), is(false));
	}
	
	@Test
	public void failing(){
		Range range = new Range(1, 3);
		
		assertThat(range.contains(4), is(true));
	}



}
