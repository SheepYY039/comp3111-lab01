/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package COMP3111.lab01;

public class Library {
	public static void main(String arg[] ){
		Library lib = new Library();
		if (lib.someLibraryMethod())
			System.out.println("Hello, World!");
	}
    public boolean someLibraryMethod() {
        return true;
    }
}
