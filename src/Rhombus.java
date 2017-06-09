
public class Rhombus {

	public static void main(String[] args) {
		// TODO Printing out a rhombus of alphabets using nested loops.
		
		int i = 0;
		char draw = 'a';
		int letter = (int)draw;

		System.out.print(""+draw);
		System.out.print(String.valueOf(draw));
		while(i<3){
			if(i==2){
				System.out.print(""+draw);
			}
			else{
				System.out.print(" ");
			}
			
			while(i<2){
				if(i==1){
					System.out.print(String.valueOf(draw));
				}
				else{
					System.out.print(" ");
				}
				
				while(i<1){
					if(i==0){
						System.out.print(String.valueOf(draw));i++;
					}
					else{
						System.out.print(" ");i++;
					}
				draw = (char)++letter;
				}
				System.out.print(String.valueOf(draw));
			}
			System.out.print(draw);
		}

	}

}
