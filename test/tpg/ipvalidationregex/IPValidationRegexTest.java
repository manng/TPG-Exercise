package tpg.ipvalidationregex;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class IPValidationRegexTest {
	
	private String fileName;
	private InputStream inputStream;
	
	@Before
	public void setup(){
		fileName = "/resources/IPAddresses.txt";
        inputStream = IPValidationRegex.getInputStream(fileName);
	}

	@Test
	public void test() {
		try {
			IPValidationRegex.testInputStream(inputStream);
			assertTrue(true);
		} catch (Exception e){
			e.printStackTrace();
			fail("Exception running testInputStream");
		}
	}

}
