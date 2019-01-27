package zad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class zad_5 {
	public static void main(String[] args) throws IOException{

		URL url = new URL("https://pl.wikipedia.org/wiki/Ma%C5%82pa_(znak_pisarski)");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		String line;
		while((line = in.readLine()) != null) if(line.contains("@"))System.out.println(in.readLine() + "\n");
}
}
