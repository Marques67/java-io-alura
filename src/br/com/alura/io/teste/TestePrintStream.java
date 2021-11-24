package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
			
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.println("daoldwodawod");
		
		ps.close();
	}
}
