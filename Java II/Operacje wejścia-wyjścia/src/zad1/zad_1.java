package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad_1 {
	
	public static void main(String[] args) throws FileNotFoundException{
        Scanner odczyt = new Scanner(new File("dane1.txt"));
        while(odczyt.hasNextLine()) System.out.println(odczyt.nextLine());
	}
}

