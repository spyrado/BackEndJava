package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteSaidaDeArquivo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("lorem.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("Ola meu nome é nicolas");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("Ola meu nome é gisele binti");
		
		bufferedWriter.close();
		
	}
}
