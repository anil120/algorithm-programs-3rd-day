package pack2;
import com.function.utilities.utility;
public class Stopwatch
{
	
		long start =0;
		long stop =0;
		public void start()
		{
			 start=System.currentTimeMillis();
		}
		public void stop()
		{
			stop=System.currentTimeMillis();
		}
		public static void main(String[] args)
		{
			Stopwatch s= new Stopwatch();
			System.out.println("enter 0 to start");
			int startPoint =utility.getInt();
			if(startPoint==0)
			{
				s.start();
			}
			System.out.println("enter 1 to end");
			int endPoint=utility.getInt();
			if(endPoint==1)
			{
				s.stop();
			}
			double elapsTime=s.stop -s.start;
			System.out.println(elapsTime*0.001);
		}
	

}
