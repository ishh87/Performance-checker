/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.util.*;

/**
 *
 * @author hp
 */

public class IOManager{
static int clock=0;// **This has to be made Universal Clock.**
static public int totalProcessIOManager;
//static public int prev_time=0;
static public int waste_time=0;
static Vector<Proces> listOFCurrentIOProcess=new Vector<Proces>();
static Vector<Proces> listOFCompletedIOProcess=new Vector<Proces>();
//static Vector<Integer> timeLeftForCurrentIOProcess = new
//Vector<Integer>();
static public void calculateWastageTime()//to print waste time
{
System.out.println("The total time wasted while using multiple Processes is: "+waste_time);
}
static public void increaseAndUpdateAllProcessWithTime()
{
if(listOFCurrentIOProcess.size()<=0)
return;
for(int i=0;i<listOFCurrentIOProcess.size();i++)//for each process in io
{
double prev=listOFCurrentIOProcess.get(i).IOEXEC;
double x=(double)((double)5/100)*(double)prev;//5% extra time
// System.out.println("Value of 5 % of "+prev +" is "+x);
listOFCurrentIOProcess.get(i).IOExtra+=x;
//
// timeLeftForCurrentIOProcess.set(i,timeLeftForCurrentIOProcess.get(i)+x);
listOFCurrentIOProcess.get(i).IOEXEC=prev+x;
waste_time+=x;//extra time added to waste time
}
}
static public void updateAllProcessWithTime(){
if(listOFCurrentIOProcess.size()<=0)
return;
while(listOFCurrentIOProcess.size()!=0){
    clock +=100;   // **This has to be made Universal Clock.**
for(int i=0;i<listOFCurrentIOProcess.size();i++)
{
double prev=listOFCurrentIOProcess.get(i).IOEXEC;

//double x=prev-100;//update time by subtracting time time completed
if(prev<100){
listOFCurrentIOProcess.get(i).IOEXEC=0;
//Controller.io_processes.remove(listOFCurrentIOProcess.get(i).getId());
//Controller.add_in_waiting(listOFCurrentIOProcess.get(i));
listOFCompletedIOProcess.add(listOFCurrentIOProcess.get(i));
//System.out.println("Process send out of io");
//System.out.println("HELLO added to io complle");
listOFCurrentIOProcess.remove(listOFCurrentIOProcess.get(i));
}
else
listOFCurrentIOProcess.get(i).IOEXEC-=100;
}
}
}
static public void addNewProcesLookingForIO(Proces p){
listOFCurrentIOProcess.add(p);
//Controller.add_in_io(p);
increaseAndUpdateAllProcessWithTime();
}
static public Vector<Proces> getCompletedProcesses(){
Vector<Proces> v=listOFCompletedIOProcess;
// System.out.println("IO COMle "+v.size());
listOFCompletedIOProcess.clear();
return v;
}
}

