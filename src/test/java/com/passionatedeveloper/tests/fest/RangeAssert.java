package com.passionatedeveloper.tests.fest;

import static org.fest.assertions.Formatting.format;

import org.fest.assertions.GenericAssert;

import com.passionatedeveloper.tests.Range;

public class RangeAssert extends GenericAssert<RangeAssert, Range> {

	public RangeAssert(Range actual) {
		super(RangeAssert.class, actual);
	}

	public static RangeAssert assertThat(Range actual) {
		return new RangeAssert(actual);
	}

	public RangeAssert contains(int... integers) {
		for (int i : integers) {
			if (!actual.contains(i)) {
				fail(format("range:<%s> does not contain :<%s>", actual,
						integers));
			}
		}
		return this;
	}

	public RangeAssert doesNotContain(int... integers) {
		for (int i : integers) {
			if (actual.contains(i)) {
				fail(format("range:<%s> should not contain :<%s>", actual,
						integers));
			}
		}
		return this;
	}

}
