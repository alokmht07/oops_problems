import java.io.*;

class nestedSwitch {

	public static void main (String[] args)
	{
		int x = 1, y = 2;
	
		// Outer Switch
		switch (x) {
	
		// If x == 1
		case 1:
			switch (y) {
	
			case 2:
				System.out.println("Choice is 2");
				break;
	
			case 3:
				System.out.println("Choice is 3");
				break;
			}
			break;
	
		case 4:
			System.out.println("Choice is 4");
			break;
	
		case 5:
			System.out.println("Choice is 5");
			break;
	
		default:
			System.out.println("Choice is other than 1, 2 3, 4, or 5");
			
		}
	}
}

