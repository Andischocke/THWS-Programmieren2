package exercise17.task4;

import exercise17.task3.StackGeneric;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestStackGeneric {
	StackGeneric<String> stack = null;

	@BeforeEach
	void setUp() {
		stack = new StackGeneric<String>();
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void testTypes() {
		assertEquals(new ArrayList<String>(), stack.getTypeList());
	}

	@Test
	void testPush() {
		stack.push("Hello");
		stack.push("World");
		assertEquals("Hello", stack.getTypeList().get(0));
		assertEquals("World", stack.getTypeList().get(1));
	}

	@Test
	void testPop() {
		testPush();
		assertEquals("World", stack.pop());
		assertEquals("Hello", stack.pop());
	}
}