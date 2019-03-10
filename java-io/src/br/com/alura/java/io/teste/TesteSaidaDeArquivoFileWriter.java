package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteSaidaDeArquivoFileWriter {
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fileOutputStream = new FileOutputStream("lorem.txt");
//		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
//		FileWriter fileWriter = new FileWriter("lorem2.txt");
//		
//		fileWriter.write("Ola meu nome é nicolas");
//		//System.lineSeparator() -> ele pula linha retorna \n ou \r\n, depende do sistema operacional
//		fileWriter.write(System.lineSeparator());
//		fileWriter.write(System.lineSeparator());
//		fileWriter.write("Ola meu nome é gisele binti");
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem2.txt"));

	    bufferedWriter.write("Ola meu nome é nicolas");
	    bufferedWriter.newLine();
	    bufferedWriter.newLine();
	    bufferedWriter.write("Ola meu nome é giseleasdasdasdasds binti");
		
	    bufferedWriter.close();
		
	}
}
