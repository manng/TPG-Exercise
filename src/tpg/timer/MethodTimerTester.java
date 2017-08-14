package tpg.timer;

import java.io.InputStream;
import java.lang.reflect.Method;

import tpg.ipvalidationregex.IPValidationRegex;
import tpg.studentsort.StudentSortTester;

public class MethodTimerTester {

/**
 * Main method
 * 
 * @param args		args[0] contains the location of the file of IP address 
 * @throws SecurityException 
 * @throws NoSuchMethodException 
*/
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		System.out.println("Timing method main of StudentSortTester");
		Method method1 = StudentSortTester.class.getMethod("main", String[].class);
		Object inputObject = (Object) args;
		MethodTimer.callMethod(null, method1, inputObject);

		System.out.println("Timing method getInputStream of IPValidationRegex");
		Method method2 = IPValidationRegex.class.getMethod("getInputStream", String.class);
		inputObject = (Object) "/resources/IPAddresses.txt";
		InputStream inputStream = (InputStream) MethodTimer.callMethod(null, method2, inputObject).getOutput();
		
		System.out.println("Timing method testInputStream of IPValidationRegex");
		Method method3 = IPValidationRegex.class.getMethod("testInputStream", InputStream.class);
		inputObject = (Object) inputStream;
		MethodTimer.callMethod(null, method3, inputObject);
	}
}
