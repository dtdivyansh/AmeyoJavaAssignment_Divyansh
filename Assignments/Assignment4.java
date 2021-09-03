import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Assignment4 {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		Random rn = new Random();				// for random generation of numbers
		
		for(int i=0;i<100;i++) {
			arr[i] = rn.nextInt(100);			// assigning random integer to array
		}
		
		Logger logger = Logger.getLogger("DivyanshLog");
		
		try {
			FileHandler fileh = new FileHandler( "/home/divyanshtiwari/Ameyo Divyansh/My_Workspace/log4.txt" );
			logger.addHandler(fileh);
			fileh.setFormatter(new SimpleFormatter());
			
			String res1 = "";
			for(int i=0;i<100;i++)
				res1 = res1+arr[i]+" ";		// printing with for loop in log
			logger.info(res1);
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		}  
		
		logger.info("");
		
		String res2 = "";
		
		for(int i:arr)					// printing with for each loop
			res2 = res2+i+" ";
		
		logger.info(res2);
		
		
		
	}
	
}
