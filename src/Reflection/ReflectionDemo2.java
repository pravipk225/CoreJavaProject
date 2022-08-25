package Reflection;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * How to call private method from another class in java?
 * 
 * We can call the private method from outside the class by changing
 * the runtime behaviour of the class.
 * 
 * By the help of "java.lang.Class" class and
 * "java.lang.reflect.Method" class, we can call private method from
 * any other class.
 *
 */
public class ReflectionDemo2
{
    public static void main(String[] args)
    {
    	 Class<ArrayList> classObj = ArrayList.class;
         /*
          * Gets the package for this class. The class loader of this class is
          * used to find the package.
          */
         Package packageObj = classObj.getPackage();
         /*
          * Returns:The fully-qualified name of this package
          */
         System.out.println("Package Name = " + packageObj.getName());
         /*
          * Returns:the title of the implementation, null is returned if it is not known.
          */
         System.out.println("ImplementationTitle = "+packageObj.getImplementationTitle());
         /*
          * Returns:the version of the implementation, null is returned if it is not known.
          */
         System.out.println("ImplementationVersion = "+packageObj.getImplementationVersion());
         /*
          * Returns:the specification vendor, null is returned if it is not known.
          */
         System.out.println("SpecificationVendor = "+packageObj.getSpecificationVendor());
         
         /*
          * Returns:the specification title, null is returned if it is not known.
          */
         System.out.println("SpecificationTitle = "+packageObj.getSpecificationTitle());
        try
        {
            Class<?> classObj1 = Class.forName("Student");
            Student studentObj = (Student) classObj1.newInstance();
            Method method = classObj1.getDeclaredMethod("showStudentFullName", null);
            method.setAccessible(true);
            method.invoke(studentObj, null);
            /*
             * Parameters:
             * 
             * obj - the object the underlying method is invoked from
             * 
             * args - the arguments used for the method call
             * 
             * Returns: the result of dispatching the method
             * represented by this object on obj with parameters args
             * 
             */

           
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}