package br.com.TesteIO.mains;
import java.io.*;


public class mainIO {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");//indicando input
        InputStreamReader isr = new InputStreamReader(is);//criando Reader
        BufferedReader br = new BufferedReader(isr);//criando buffer para traduzir os bytes
   
		//System.out.println("Digite sua mensagem:");
        String linha = br.readLine(); // primeira linha
        
        while (linha != null) {        	        	
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
		
	
		
	}

}
