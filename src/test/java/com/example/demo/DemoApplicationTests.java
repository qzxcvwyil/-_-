package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

	@Test
	void testFactorial() {
		assertEquals(120, DemoApplication.Factorial(5));
		assertEquals(1, DemoApplication.Factorial(0));
	}

	@Test
	void testMax() {
		assertEquals(9, DemoApplication.Max(3, 9, 5));
		assertEquals(15, DemoApplication.Max(15, 15, 10));
	}

	@Test
	void testLYear() {
		assertTrue(DemoApplication.LYear(2020));
		assertFalse(DemoApplication.LYear(2021));
	}

	@Test
	void testrtring() {
		assertEquals("cba", DemoApplication.rString("abc"));
		assertEquals("", DemoApplication.rString(""));
	}

	@Test
	void testpalindrome() {
		assertTrue(DemoApplication.palindrome("level"));
		assertFalse(DemoApplication.palindrome("hello"));
	}

	@Test
	void testrnumber() {
		int min = 1, max = 10;
		int randomNumber = DemoApplication.rnumber(min, max);
		assertTrue(randomNumber >= min && randomNumber <= max);
	}

	@Test
	void testBubbleSort() {
		int[] array = {5, 3, 8, 4, 2};
		int[] sortedArray = {2, 3, 4, 5, 8};
		DemoApplication.bubbleSort(array);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	void testfarray() {
		int[] array = {1, 2, 3, 4, 5};
		assertEquals(2, DemoApplication.farray(array, 3));
		assertEquals(-1, DemoApplication.farray(array, 6));
	}

	@Test
	void testGenerateMultiplicationTable() {
		int number = 5;
		String[] expectedTable = {
				"5 x 1 = 5",
				"5 x 2 = 10",
				"5 x 3 = 15",
				"5 x 4 = 20",
				"5 x 5 = 25",
				"5 x 6 = 30",
				"5 x 7 = 35",
				"5 x 8 = 40",
				"5 x 9 = 45",
				"5 x 10 = 50"
		};

		String[] resultTable = DemoApplication.table(number);
		assertArrayEquals(expectedTable, resultTable);
	}
	@Test
	void testFibonacci() {
		assertEquals(0, DemoApplication.fibonacci(0));
		assertEquals(1, DemoApplication.fibonacci(1));
		assertEquals(21, DemoApplication.fibonacci(8));
	}

	@Test
	void testToBinary() {
		assertEquals("1010", DemoApplication.toBinary(10));
		assertEquals("0", DemoApplication.toBinary(0));
	}

	@Test
	void testSafeDivide() {
		assertEquals(2.0, DemoApplication.safeDivide(4, 2));
		assertEquals(Double.NaN, DemoApplication.safeDivide(4, 0));
	}
}
