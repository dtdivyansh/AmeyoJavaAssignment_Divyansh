import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;

public class Assignment6 {
	
	static Logger logger = Logger.getLogger("DivyanshLog");
	
	static void tablePrint(int n) {
		
		for(int i=1;i<=10;i++) {
			logger.info(n+" x "+i+" = "+n*i);						// printing table in log 
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();										// taking input from user
		
		try {
			FileHandler fileh = new FileHandler( "/home/divyanshtiwari/Ameyo Divyansh/My_Workspace/log6.txt" ); // log file for it
			logger.addHandler(fileh);
			fileh.setFormatter(new SimpleFormatter());
			tablePrint(n);											// calling tablePrint() function
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		}  
		
		sc.close();													// Closing scanner to control memory leak
	}

}
