import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				// Taking Input from User
		int l = n*2+1,i=0;					// deciding number of max elements to print
		while(i<=n) {
			int c = i;
			int v = -1;
			for(int j=0;j<(l/2-i);j++) {	// printing whitespaces
				System.out.print("  ");
			}
			
			for(int j=0;j<i*2+1;j++) {		// printing required numbers
				System.out.print(c+" ");
				c+=v;
				if(c==0)					// start incrementing after printing 0
					v=1;
			}
			
			for(int j=0;j<(l/2-i);j++) {	// printing rest of the whitespaces
				System.out.print("  ");
			}
			i++;
			System.out.println();			// changing line
			
			sc.close();
		}
		
	}

}
