package exceptions;

import java.io.IOException;

public class ExceptionsApplication {
	
	// Link naar exception hierachie
	// https://interviewnoodle.com/exception-in-java-89a0b41e0c45

	public static void main(String[] args) {
		// Unchecked exception dus we hoeven geen try catch block
		// Als er dan wel een exception wordt gegooit dan stopt de main methode
		method1(-2);

		// Checked exception. method2 kan mogelijk 2 exceptions gooien. Namelijk
		// IOException en ClassCastException dus moeten we die afvangen.
		// 
		try {
			method2(3);
		} catch (IOException e) {
			// 
		} catch (MijnException e) {
			// Je mag dus ook je eigen exception gaan afvangen
		} finally { // finally is optioneel en wordt altijd uitgevoerd
			System.out.println("In finally");
		}
	}

	/* 
     * Unchecked exception (Runtime exception)
     * 
     * Regels:
     * 	Als een method een unchecked exception gooit dan hoeft die geen
     *  throws te doen
     *  
     * Een Exception gooien stopt direct de huidige methode en geeft die 
     *  exception gelijk terug aan de aanroeper. Zelfs de return wordt genegeerd. 
     * 
	 */
	public static void method1(int a) {
		if (a < 0)
			throw new IllegalArgumentException();

		System.out.println("In method1");
	}

	/*
	 * Checked exception
	 * 
	 * Regels:
	 *  Een method die een checked exception gooit MOET die aangeven 
	 *   dmv throws
	 *
	 *  Als een methode een throws heeft hoef je geen exception
	 *   te gooien echter mag wel. 
	 *  
	 *  Een method kan meerdere execptions bij de throws hebben. 
	 *  
	 */
	public static void method2(int a) throws IOException, MijnException {
		if (a == 1)
			throw new IOException();
		else if (a == 2)
			throw new MijnException();

		System.out.println("In method2");
	}

}
