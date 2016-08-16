package br.com.TesteIO.mains;
import java.io.*;
import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(is);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
		
		while(entrada.hasNextLine()){
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}
		
		bw.close();
		System.out.println("teste");
	}

}
