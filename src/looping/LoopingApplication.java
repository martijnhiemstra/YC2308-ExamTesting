package looping;

public class LoopingApplication {

	public static void main(String[] args) {
		
		// Oefening 1
		outer:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == j) {
					continue outer;
				}
				System.out.println("i=" + i + " , j=" + j);
			}
		}
		
		
		// Oefening 2
	
		int c = 0;
		boolean flag = true;
		
		for (int i = 0; i < 3; i++) {
			while (flag) {
				c++;
				if(i>c || c>5) flag = false;
			}
		}
		System.out.println(c);
		
		
		// Oefening 3

		int j = 0;
		
		for (int i = 0; i < 10; i++) {
			if (i == 2) System.out.println("BINGO");

			System.out.println("i = " + i);
			
			j += i;
		}
		
	}

}
