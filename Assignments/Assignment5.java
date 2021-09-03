import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Assignment5 {
	
	static Logger logger = Logger.getLogger("DivyanshLog");  		// Creating a new logger
	
	
	
	static String fibo(int a,int b,int n, String s) {
		if(n==1)
			return s;												// return if 50 fibo numbers are generated
		
		if(a==0) {
			s = s+b+" ";
		}
		
		b = b+a;
		a = b-a;													// interchanging and modification of numbers				
		s = s+b+" ";
		
		return fibo(a, b, --n,s);									// Recursion by decrementing the count n
		
		}
		
	
	public static void main(String[] args) {
		
		try {
			FileHandler fileh = new FileHandler( "/home/divyanshtiwari/Ameyo Divyansh/My_Workspace/log5.txt" ); // file to save log
			logger.addHandler(fileh);
			fileh.setFormatter(new SimpleFormatter());
			String reString1 = fibo(0,1,50,"");							// getting output as string after calling fibo()
			
			logger.info("Through Recursion: "+ reString1);
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			//e.printStackTrace();
		}  
		
		String reString2 = "1 ";
		int a=0; int b=1; int n=50;
		while(n>1) {														// fibo algorithm in loop
			reString2 = reString2 + (a+b)+" ";
			b = a+b;
			a = b-a;
			n--;
		}
		logger.info("Through Iteration : "+reString2);						// printing in log
		
	}

}
