
public class Three {
	
	public static void main(String[] args) {
		// TODO Printing out the biggest of 3 numbers
		//Initializing given numbers
		int a = 2;
		int b = 5;
		int c = 7;
		
		if(a > b){	
			if(a > c)		//If a is bigger than b, we only need to compare a to c
				System.out.print(a);
			else
				System.out.print(c);
		}
		else{		
			if(b > c)		//If b is bigger than a, we need to compare to c
				System.out.print(b);
			else
				System.out.print(c);
		}
	
	}

}
