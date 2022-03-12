package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		File file = new File("C:\\temp\\in.txt"); /*Usar duas barras para indicar o caminho*/

		Scanner sc = null; /*Null para ter um valor inicial*/
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { /*Testar se ainda existe uma nova linha no arquivo*/
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
