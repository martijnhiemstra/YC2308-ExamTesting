package casting;

public class Casting {

	public static void main(String[] args) {
		
		int a = 6;
		String b = "Test";
		double c = 3.56;
		char d = 'e';
		
		// a = 32 bits
		// short = 16 bit
		// short a_short = a; // Dit mag niet
		long a_long = a;
		short a_short = (short)a;
		
		int i_int = (int)c;
		
		
		Person person = new Person();
		Car car = new Car();
		Administrator administrator = new Administrator();
		
		// Dit mag niet omdat person en car geen is-relatie hebben
		// Person person2 = (Person)car;
		
		// Casten naar een super class mag wel
		Person person2 = (Person)administrator;
		
		// Casten naar een sub class mag niet 
		// Administrator administrator = (Administrator)person;
		
	}
	
}
