import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();				// input String
		
		String res = "";
		int l = s.length();
		
		for(int i=l-1;i>=0;i--) {
			String v = ""+s.charAt(i);
			if(!res.contains(v)) {				// checking if res string already contains character v
				res+=v;							// adding v in res if it doesnt exist
			}
		}
		
		System.out.println(res);
		sc.close();
	}
	
	
}

