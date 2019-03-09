package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class TesteLeituraDeArquivo {
	
	public static void main(String[] args) throws IOException {
	
		// Fluxo de Entrada com Arquivo
		
		FileInputStream fileInputStream = new FileInputStream("lorem.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		String linha = bufferedReader.readLine();
		
		while(linha != null) {
			
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}
		
		bufferedReader.close();
         
	}
}