package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class TesteSaidaDeArquivoPrintStream {
	public static void main(String[] args) throws IOException {
		
		PrintStream printStream = new PrintStream("lorem2.txt");
		
		printStream.println("Texto que será incluido");
		printStream.println("Texto que será incluido");
		printStream.println("Texto que será incluido");
		printStream.println("Texto que será incluido");
		
		printStream.close();
	}
}
