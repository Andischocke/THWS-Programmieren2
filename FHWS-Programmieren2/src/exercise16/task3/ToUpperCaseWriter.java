package exercise16.task3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ToUpperCaseWriter extends Writer {
	public Writer writer;

	public ToUpperCaseWriter(Writer writer) {
		this.writer = writer;
	}

	public void write(char c) throws IOException {
		writer.write(Character.toUpperCase(c));
	}

	public void write(String string, int offset, int length) throws IOException {
		for (int i = offset; i < (offset + length); i++)
			write(string.charAt(i));
	}

	@Override
	public void write(char[] charArray, int off, int len) throws IOException {
		for (int i = off; i < (off + len); i++) {
			write(charArray[i]);
		}
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new ToUpperCaseWriter(new OutputStreamWriter(System.out)));
			bw.write("Hello World! 0123");
			bw.flush();
			bw.close();
		} catch (Exception e) {
		}
	}
}