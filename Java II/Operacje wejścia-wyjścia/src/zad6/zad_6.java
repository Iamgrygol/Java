package zad6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class zad_6 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.kurshtml.edu.pl/css/zapytania_mediow,media.html");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		String line;
		while((line = in.readLine()) != null) if(line.contains("@")) if(line.matches(".*@(?!media).*")) System.out.println(line);
	}
}