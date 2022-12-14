package Reflection;
import java.lang.reflect.Method;

/**
 * How to call parameterized private method from another class?
 * 
 * We can call the private method from outside the class by changing the runtime
 * behaviour of the class.
 * 
 * By the help of "java.lang.Class" class and "java.lang.reflect.Method" class,
 * we can call private method from any other class.
 * 
 * CREATION OF OBJECT
 * Class<?> classObj = Class.forName("DisplayNumber");
 *
 *  Class<Display> classObj = Display.class;
 *  
 *
 */
public class ReflectionDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class<Display> classObj = Display.class;
            Object displayObject = classObj.newInstance();

            Method method = classObj.getDeclaredMethod("DisplayNumber", new Class[] { int.class });
            method.setAccessible(true);
            method.invoke(displayObject, 1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        // new video 
        try
        {
            Class<?> classObj = Class.forName("DisplayNumber");
            /*
             * Returns:a newly allocated instance of the class represented by
             * this object.
             */
            Display displayMessage = (Display) classObj.newInstance();
           // displayMessage.DisplayNumber(0);
        }
        catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

}