package com.passionatedeveloper.tests.hamcrest;

import static java.lang.String.format;

import java.util.Arrays;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import com.passionatedeveloper.tests.Range;

public class Contains extends TypeSafeMatcher<Range> {

	private final int[] integers;

	public Contains(int[] integers) {
		this.integers = integers;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText(format("contains <%s>",
				Arrays.toString(integers)));
	}

	@Override
	public boolean matchesSafely(Range item) {
		for (int i : integers) {
			if (!item.contains(i))
				return false;
		}
		return true;
	}

	@Factory
	public static Matcher<Range> contains(int... integers) {
		return new Contains(integers);
	}

}
