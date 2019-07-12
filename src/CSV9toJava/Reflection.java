package CSV9toJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Reflection {

	   public static Cat createCat() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {

	       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	       String className = reader.readLine();

	       Class clazz = Class.forName("className");
	       Cat cat = (Cat) clazz.newInstance();

	       return cat;
	   }

	public static Object createObject() throws Exception {

	  
	   Class<?> clazz = Class.forName("CSV9toJava.IMA");
	   Object result = clazz.newInstance();

	   return result;
	}

	   public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException  {
//		   ClassLoader classLoader2 = Reflection.class.getClassLoader();
//
//		    try {
//		        Class aClass = classLoader2.loadClass("CSV9toJava.ChartList");
//		       
//		        System.out.println("aClass.getName() = " + aClass.getName());
//		    } catch (ClassNotFoundException e) {
//		        e.printStackTrace();
//		    }
//		    String source = "package test; public class Test { static { System.out.println(\"hello\"); } public Test() { System.out.println(\"world\"); } }";

		 // Save source in .java file.
//		 File root = new File("/java"); // On Windows running on C:\, this is C:\java.
//		 File sourceFile = new File(root, "CSV9toJava/Cat.java");
//		 sourceFile.getParentFile().mkdirs();
//		 Files.write(sourceFile.toPath(), source.getBytes(StandardCharsets.UTF_8));
//
//		 // Compile source file.
//		 JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//		 compiler.run( null,null,null,sourceFile.getPath());
//		
//		 // Load and instantiate compiled class.
//		 URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
//		 Class<?> cls = Class.forName("CSV9toJava.Test", true, classLoader); // Should print "hello".
//		 Object instance = cls.newInstance(); // Should print "world".
//		 System.out.println(instance); // Should print "test.Test@hashcode".
		// createCat();
		  
//		Class c = Class.forName("CSV9toJava.Driver");
//		Object obj = c.newInstance(); 
//	//	Cat cat = (Cat) obj; 
//	     System.out.println(obj.toString());
//	   }
	   Cat cat = new Cat(); 
	   System.out.println(cat.toString());
	  // ((File) cat).renameTo(Class.forName("CSV9toJava.Driver"));
	   File oldfile = new File("CSV9toJava.a.txt");
	   File b = new File("c:\\Wohnung\\b.txt");
	   File a = new File("c:\\Wohnung\\a.txt");
	 
	   File myFile = new File("c:\\Wohnung\\chartIn.java");
	   myFile.createNewFile();
	  
	   a.renameTo(myFile);
	   Class aclass = myFile.getClass(); 
	   System.out.println(aclass.toString());
//	   
//	   Class f = Class.forName("CSV9toJava.chartIn");
//	   Object obj = f.newInstance(); 
//	   System.out.println(obj.toString());
	}}