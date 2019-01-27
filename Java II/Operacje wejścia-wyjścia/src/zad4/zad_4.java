package zad4;

import java.io.IOException;
import java.io.RandomAccessFile;

public class zad_4 {

	public static void main(String[] args) throws IOException {
	RandomAccessFile plik = new RandomAccessFile("napis.txt", "r");
	plik.seek(15464);
	System.out.println(plik.readLine());
}
}
