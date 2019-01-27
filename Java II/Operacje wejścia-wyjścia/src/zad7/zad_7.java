package zad7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad_7 {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("http+.*/kontakt");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		String line;
		Pattern obiektTypuPattern = Pattern.compile(".*<href\\s+a=\".*\">.*");
		while((line = in.readLine()) != null) {
			Matcher obiektTypuMatcher = obiektTypuPattern.matcher(line);
	           while(obiektTypuMatcher.find()) System.out.println(obiektTypuMatcher.group());
		}
	}
}
