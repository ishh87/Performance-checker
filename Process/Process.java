import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Process
{
   long pid,IOpercentage,totaltime,PST,PET,AT,CT;
   float BT,IOEXEC;
       long TAT=CT-AT;
       //long WT=TAT-BT;
   public Process(long pid){
       Random R=new Random();
       this.pid=pid;
     totaltime = ThreadLocalRandom.current().nextInt(3000,8000);
     int check=R.nextInt(2);
     if(check==0){
         IOpercentage=
         BT=(float)((0.8)*totaltime);
         IOEXEC=totaltime-BT;
     }
     else{
        BT=(float)((0.2)*totaltime);
         IOEXEC=totaltime-BT;
     }
     }
  
}