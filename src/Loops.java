
public class Loops {

	public static void main(String[] args) {
	
		//step 5-a
	
		int i = 0;
		
		while (i <= 100) {
			System.out.println(i);
			i = i + 2;
		
		}
		
		//step 5-b
	
		int c = 100;
		
		while (c >= 0) {
			System.out.println(c);
			
			//special case for c = 1
			if (c == 1) {
				c = c - 1;
				System.out.println(c); //make sure we output 0
			}
					
			c = c - 3;
				
		}//while
		
		//step 5-c
		
		for (int x = 1; x <= 100; x++) {
			System.out.println(x);
			
			if (x == 99) {
				x = x + 1;
				System.out.println(x);
			}
			
			x = x + 1;
			
		}

		//step 5-d
			
		int max = 100;
		
		for (int b = 1; b <= max; b++) {
			if (b % 3 == 0 && b % 5 == 0) {
				System.out.println("HelloWorld");
				
			} else if (b % 3 ==0) {
				System.out.println("Hello");
	
			} else if (b % 5 ==0) {
				System.out.println("World");
				
			} else {
				System.out.println(b);
				
			}

		}
		
	}//main

}
