package zad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class zad_3 {

	public static void main(String[] args) throws IOException {
		Path œcie¿ka = Paths.get("", "dane2.txt");
		String tekst= new String(Files.readAllBytes(œcie¿ka),"UTF-8");
		System.out.println(tekst);
	}
}
