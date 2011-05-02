package com.passionatedeveloper.tests;

public class Range {

	private final int start;
	private final int end;

	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public boolean contains(int i) {
		return start <= i && end >= i;
	}

	@Override
	public String toString() {
		return String.format("%d..%d", start, end);
	}

}
