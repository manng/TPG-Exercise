package tpg.ipvalidationregex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	
	public static final String IP_REGEX = "^(0{0,2}[0-9]|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                                           "(0{0,2}[0-9]|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                                           "(0{0,2}[0-9]|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                                           "(0{0,2}[0-9]|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
	
	public static final Pattern IP_REGEX_PATTERN = Pattern.compile(IP_REGEX);
	
	public static boolean validate(String testString){
		
		Matcher m = IP_REGEX_PATTERN.matcher(testString);
		return m.matches();		
	}
	
	public static InputStream getInputStream(String fileName){
		return IPValidationRegex.class.getResourceAsStream(fileName);
	}

	public static void testInputStream(InputStream inputStream) throws IOException {
		try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
			String inLine = bufferedReader.readLine();
			while (inLine != null){
				if (IPValidationRegex.validate(inLine)){
					System.out.println(inLine);
				}
				inLine = bufferedReader.readLine();
			}
		} catch (IOException e) {
			throw e;
		} 
	}
	
}
