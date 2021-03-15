package exercise16.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestToUpperCaseWriter {

	public ByteArrayOutputStream baos;
	public ToUpperCaseWriter tucw;

	@BeforeEach
	public void prepareTest() {
		baos = new ByteArrayOutputStream();
		tucw = new ToUpperCaseWriter(new OutputStreamWriter(baos));
	}

	@AfterEach
	public void cleanUp() {
		try {
			tucw.close();
			baos.close();
		} catch (IOException e) {
			fail("IOException" + e.getMessage());
		}
	}

	@Test
	public void testWriteChar() {
		try {
			tucw.write("a");
			tucw.flush();
			assertEquals("A", baos.toString());
		} catch (IOException e) {
			fail("IOException" + e.getMessage());
		}
	}

	@Test
	public void testWriteNonChar() {
		try {
			tucw.write("!");
			tucw.flush();
			assertEquals("!", baos.toString());
		} catch (IOException e) {
			fail("IOException" + e.getMessage());
		}
	}
}