package javabeat.net.core;
/**
 * This example program prints the classpath value
 *
 * @author krishna
 *
 */
public class getClassPath {
	public static void main(String[] args) {
		// Call System property to get the classpath value
		String classpathStr = System.getProperty("java.class.path");
		System.out.print(classpathStr);
	}
}