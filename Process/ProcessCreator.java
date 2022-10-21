import java.util.*;

public class ProcessCreator {
	static int PerOfIO;
	int rate;
	
	int approxNextTime = (int) ((60000/rate) * 2 * Math.random());
	int nextProcessTime = approxNextTime + 100 - approxNextTime%100; 
	
	Queue<Process> que = new LinkedList<>();
	
	public ProcessCreator() {
	}
	public void run() {
		/* Universal clock should be made */
		while(clock < 300000 ) {
			if(clock == nextProcessTime) {
				Process p = new Process((int) (9999*Math.random()));
				approxNextTime = 50 + (int) ((600/rate) * 2 * Math.random());
				nextProcessTime += approxNextTime + 100 - (approxNextTime) % 100;
				que.add(p);
			}
		}
	}
	
	public boolean isProcessAvailable()
	{
	if(que.isEmpty() == true)
	{
	return false;
	}
	else
	{
	return true;
	}
	}

	
}
