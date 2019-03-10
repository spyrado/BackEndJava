package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteSaidaDeArquivoPrintWriter {
	public static void main(String[] args) throws IOException {
		
		PrintWriter printWriter = new PrintWriter("lorem2.txt");
		
		printWriter.println("Texto quasdasdsade será incluido");
		printWriter.println("Textoasdasdas que será incluido");
		printWriter.println("Texto que será incluido");
		printWriter.println("Texto que será incluido");
		
		printWriter.close();
	}
}
