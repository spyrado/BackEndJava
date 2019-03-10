package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiarEColarArquivo {
	
	public static void main(String[] args) throws IOException {
	
		// Fluxo de Entrada com Arquivo
		
		InputStream fileInputStream = System.in; //new FileInputStream("lorem.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		
		// Fluxo de saida de um arquivo
		OutputStream fileOutputStream = new FileOutputStream("lorem2.txt"); //System.out; 
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		//recebo a primeira linha do arquivo lorem.txt
		String linha = bufferedReader.readLine();
		
		//se a linha receber null (n tiver nada no arquivo mais
		// se a proxima linha nao vier vazia
		while(linha != null && !linha.isEmpty()) {
			
			//escrevo a primeira linha do lorem.txt para o lorem2.txt
			bufferedWriter.write(linha);
			//vou para a linha dbaixo
			bufferedWriter.newLine();
			
			//envia o conteudo de buffer para o arquivo de fato..
			bufferedWriter.flush();
			
			//guardo a proxima linha em linha
			linha = bufferedReader.readLine();
		}
		
		//ENCERRO O BUFFER READER
		bufferedReader.close();
		
		//ENCERRO O BUFFER WRITE
		bufferedWriter.close();
         
	}
}