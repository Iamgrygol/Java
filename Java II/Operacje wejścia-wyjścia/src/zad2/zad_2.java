package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad_2 {
	public static void main(String[] args) throws FileNotFoundException{
	    Scanner odczyt = new Scanner(new File("dane1.txt"));
	    int suma = 0;
	    while(odczyt.hasNextInt()) suma += odczyt.nextInt();
	    System.out.print(suma);
	}
}
