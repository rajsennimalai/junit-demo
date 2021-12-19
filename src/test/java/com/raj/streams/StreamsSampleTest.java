package com.raj.streams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StreamsSampleTest {

	@Test
	void test() {
		StreamsSample streamsSample=new StreamsSample();
		String a=streamsSample.arrayListLambda("a");
		assertEquals(a, "aa");
	}

}
