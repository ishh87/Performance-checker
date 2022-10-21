import java.util.*;

public class Controller {
	
	public static void main(String[] args) {
		/* Universal clock should be made */
		long clock=0;
		// create ProcessCreator object
		ProcessCreator pc = new ProcessCreator();
		
		// create CPUmanager object
		CPUManager cpu = new CPUManager();
		
		// create IOmanager object
		IOManager io = new IOManager();
		
		pc.run();
		clo
		while(clock<300000) {
			/* This clock time has to be added in universal clock which should be made  */
			
			
			while(pc.isProcessAvailable()) {
				Process temp = pc.que.poll();

				if(temp.IOpercentage==80) {
					io.que.add(temp);
                              io.start=process.arive;
				}
				else {
					cpu.que.add(temp);
cpu.at=process.arrive
				}
			}
			while(!io.compQue.isEmpty()) {
				Process temp = io.compQue.poll();
				if(temp.IOpercentage==80) {
					cpu.que.add(temp);
                                         cpu.AT=io.IOEXEC;
				}
				else {
					compProcess.add(temp);
                                          Process.processendtime=io.IOEXEC;
				}
			}
			while(!cpu.compQue.isEmpty()) {
				Process temp = cpu.compQue.poll();
				if(temp.IOpercentag==80) {
					compProcess.add(temp);
                                     Process.processendtime=CPU.CT;				
}
				else {
					io.que.add(temp);
                                        io.process.iostart=cpu.process.CT;
				}
			}
		}
          clock=clock+10;
	}
}
	
