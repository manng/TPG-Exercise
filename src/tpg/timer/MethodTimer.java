package tpg.timer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTimer {
	
	public static Output measureTime(Object testObject, Method method, Object... args) 
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
		long startTime = System.currentTimeMillis();
		Object output = method.invoke(testObject, args);
		long endTime = System.currentTimeMillis();
		long timeInMillis =  endTime - startTime;
		return new Output(output, timeInMillis);
	}

	public static Output callMethod(Object testObject, Method method, Object... args){
		
		try {
			Output output = measureTime(null, method, args);
			System.out.println("That method call took " + output.getTimeInMillis() + " milliseconds.\n");
			return output;
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.println("Error calling method " + method.getName() + ".\n");
			e.printStackTrace();
		}
		return null;
	}
	
}
