package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class<Display> classObj = Display.class;
		Object displayObject = classObj.newInstance();
		Method m = classObj.getDeclaredMethod("DisplayNumber", new Class[] { int.class });
		Field f = classObj.getDeclaredField("abc");
		m.setAccessible(true);
		m.invoke(displayObject, 1000);
	}
}
